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

package org.clour.inter.controller;

import java.util.Map;

import org.clour.inter.web.http.Query;

import org.clour.inter.data.util.SqlUtil;
import org.clour.inter.model.entity.InterDort;
import org.clour.inter.service.InterDortService;
import org.clour.inter.service.PlatDataService;
import org.clour.inter.web.http.BaseController;
import org.clour.inter.web.http.ErrorStatus;
import org.clour.inter.web.http.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * @author clour
 * @date 2018/1/27 inter controller
 */
@RestController
@RequestMapping("/inter")
public class InterController extends BaseController {

	private final String INTER_DATA = "/inter/data/";

	@Autowired
	PlatDataService platDataService;

	@Autowired
	InterDortService interDortService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/data/{code}")
	public Result<Page<Map>> code(@PathVariable String code, @RequestParam Map<String, Object> params) {
		InterDort condition = new InterDort();
		condition.setInterIndex(INTER_DATA + code);
		InterDort dort = interDortService.selectOne(new EntityWrapper<InterDort>(condition));
		if(dort == null)
		{
			return this.failure(ErrorStatus.METHOD_NOT_ALLOWED);
		}
		dort.setInterCondition(SqlUtil.buildCondition(params, dort.getInterCondition()));
		return this.success(platDataService.listData(new Query<>(params), dort));
	}
}
