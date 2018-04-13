package org.clour.wede.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.clour.wede","org.clour.wede.*"})
public class SpringWebConfig extends WebMvcConfigurerAdapter {
	@Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = 
                new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);

        return resolver;
    }

    @Override 
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }
}
