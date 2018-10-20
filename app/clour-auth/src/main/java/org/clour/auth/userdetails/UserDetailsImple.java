package org.clour.auth.userdetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserDetailsImple implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8945778424469799705L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
//        for (SysRole role : roleList) {
//            authorityList.add(new SimpleGrantedAuthority(role.getRoleCode()));
//        }
        // 为每一个用户添加一个基本角色
        authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorityList;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("123456"));
		return encoder.encode("123456");
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return "root";
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
