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

package org.clour.rbac.service;


import com.baomidou.mybatisplus.service.IService;
import org.clour.rbac.model.entity.SysUserRole;

/**
 * <p>
 * 用户角色表 服务类
 * </p>
 *
 * @author clour
 * @since 2017-10-29
 */
public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @author 寻欢·李
     * @date 2017年12月7日 16:31:38
     * @param userId 用户ID
     * @return boolean
     */
    Boolean deleteByUserId(Integer userId);
}
