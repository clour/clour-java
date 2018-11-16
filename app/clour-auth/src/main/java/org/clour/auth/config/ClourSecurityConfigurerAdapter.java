package org.clour.auth.config;

import org.clour.auth.component.mobile.MobileSecurityConfigurer;
import org.clour.common.bean.config.FilterIgnorePropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

//@Configuration
//@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER - 1)
//@EnableWebSecurity
//public class ClourWebSecurityConfigAdapter extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//    private FilterIgnorePropertiesConfig filterIgnorePropertiesConfig;
//	
//	@Autowired
//    private MobileSecurityConfigurer mobileSecurityConfigurer;
//	
////	@Autowired
////    private UserDetailsService userDetailsService;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry =
//                http.formLogin().loginPage("/auth/login")
//                        .loginProcessingUrl("/auth/form")
//                        .and()
//                        .authorizeRequests();
//        filterIgnorePropertiesConfig.getUrls().forEach(url -> registry.antMatchers(url).permitAll());
//        registry.anyRequest().authenticated()
//                .and()
//                .csrf().disable();
//        http.apply(mobileSecurityConfigurer);
//	}
//	
//	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//		auth.userDetailsService(userDetailsService)
//        .passwordEncoder(passwordEncoder());
//		System.out.println(userDetailsService);
//	}
//	
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER - 1)
@Configuration
@EnableWebSecurity
public class ClourSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
    @Autowired
    private FilterIgnorePropertiesConfig filterIgnorePropertiesConfig;
    @Autowired
    private MobileSecurityConfigurer mobileSecurityConfigurer;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry =
                http.formLogin().loginPage("/auth/login")
                        .loginProcessingUrl("/auth/form")
                        .and()
                        .authorizeRequests();
        filterIgnorePropertiesConfig.getUrls().forEach(url -> registry.antMatchers(url).permitAll());
        registry.anyRequest().authenticated()
                .and()
                .csrf().disable();
        http.apply(mobileSecurityConfigurer);
    }
}
