/*
 *    Copyright (c) 2018-2025, clour All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the clour.org developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: clour (slorys@hotmail.com)
 */

package org.clour.sso.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author clour
 * @date 2018/1/27
 * sso controller
 */
@RestController
public class SsoController {
	
    @GetMapping("/")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
    
   /* 用户信息校验
    * @param authentication 信息
    * @return 用户信息
    */
   @RequestMapping("/user")
   public Object principal(Authentication authentication) {
       return authentication.getPrincipal();
   }
}
