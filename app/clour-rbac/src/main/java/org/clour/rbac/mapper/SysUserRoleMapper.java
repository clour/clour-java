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

package org.clour.rbac.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.clour.rbac.model.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
  * 用户角色表 Mapper 接口
 * </p>
 *
 * @author clour
 * @since 2017-10-29
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    /**
     * 根据用户Id删除该用户的角色关系
     *
     * @param userId 用户ID
     * @return boolean
     * @author 寻欢·李
     * @date 2017年12月7日 16:31:38
     */
    Boolean deleteByUserId(@Param("userId") Integer userId);
}