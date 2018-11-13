package org.clour.auth.userdetails;

import org.clour.auth.feign.UserService;
import org.clour.common.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailService")
public class UserDetailsServiceImple implements UserDetailsService {

	@Autowired
    private UserService userService;

    @Override
    public UserDetailsImple loadUserByUsername(String username) throws UsernameNotFoundException {
    	UserVO userVo = userService.findUserByUsername(username);
        if (userVo == null) {
            throw new UsernameNotFoundException("用户名不存在或者密码错误");
        }
        return new UserDetailsImple(userVo);
    }

}
