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

package org.clour.rbac.controller;

import java.util.Map;

import org.clour.rbac.model.entity.SysOauthClientDetails;
import org.clour.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import org.clour.common.util.Query;
import org.clour.rbac.service.SysOauthClientDetailsService;
import org.clour.common.web.BaseController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author clour
 * @since 2018-05-15
 */
@RestController
@RequestMapping("/client")
public class OauthClientDetailsController extends BaseController {
    @Autowired
    private SysOauthClientDetailsService sysOauthClientDetailsService;

    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysOauthClientDetails
     */
    @GetMapping("/{id}")
    public SysOauthClientDetails get(@PathVariable Integer id) {
        return sysOauthClientDetailsService.selectById(id);
    }


    /**
     * 分页查询信息
     *
     * @param params 分页对象
     * @return 分页对象
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping("/page")
    public Page page(@RequestParam Map<String, Object> params) {
        return sysOauthClientDetailsService.selectPage(new Query<>(params), new EntityWrapper<>());
    }

    /**
     * 添加
     *
     * @param sysOauthClientDetails 实体
     * @return success/false
     */
    @PostMapping
    public R<Boolean> add(@RequestBody SysOauthClientDetails sysOauthClientDetails) {
        return new R<>(sysOauthClientDetailsService.insert(sysOauthClientDetails));
    }

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    public R<Boolean> delete(@PathVariable String id) {
        SysOauthClientDetails sysOauthClientDetails = new SysOauthClientDetails();
        sysOauthClientDetails.setClientId(id);
        return new R<>(sysOauthClientDetailsService.deleteById(sysOauthClientDetails));
    }

    /**
     * 编辑
     *
     * @param sysOauthClientDetails 实体
     * @return success/false
     */
    @PutMapping
    public R<Boolean> edit(@RequestBody SysOauthClientDetails sysOauthClientDetails) {
        return new R<>(sysOauthClientDetailsService.updateById(sysOauthClientDetails));
    }
}