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

package org.clour.inter.mapper;

import java.util.List;
import java.util.Map;

import org.clour.inter.web.http.Query;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import org.apache.ibatis.annotations.Param;

/**
 * <p>
  * 日志表 Mapper 接口
 * </p>
 *
 * @author clour
 * @since 2017-11-20
 */
@SuppressWarnings("rawtypes")
public interface PlatDataMapper extends BaseMapper {
	
	List<Map<String, Object>> listData(@Param("content") String content, @Param("soure") String soure, @Param("condition") String condition);
	
	List<Map<String, Object>> listData(Query query, @Param("content") String content, @Param("soure") String soure, @Param("condition") String condition);
	
}