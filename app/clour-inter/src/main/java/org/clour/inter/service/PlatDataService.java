package org.clour.inter.service;

import java.util.List;
import java.util.Map;

import org.clour.inter.web.http.Query;
import org.clour.inter.model.entity.InterDort;

import com.baomidou.mybatisplus.plugins.Page;

@SuppressWarnings("rawtypes")
public interface PlatDataService {
	
	List<Map<String, Object>> listData(InterDort dort);
	
	Page listData(Query query, InterDort dort);
}
