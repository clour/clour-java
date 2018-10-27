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

package org.clour.rbac.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.clour.rbac.mapper.SysRoleDeptMapper;
import org.clour.rbac.model.entity.SysRoleDept;
import org.clour.rbac.service.SysRoleDeptService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与部门对应关系 服务实现类
 * </p>
 *
 * @author clour
 * @since 2018-01-20
 */
@Service
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDept> implements SysRoleDeptService {
	
}
