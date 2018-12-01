package org.clour.inter.service.imple;

import java.util.List;
import java.util.Map;

import org.clour.inter.web.http.Query;
import org.clour.inter.mapper.PlatDataMapper;
import org.clour.inter.model.entity.InterDort;
import org.clour.inter.service.PlatDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;

@Service
public class PlatDataServiceImple implements PlatDataService {
	
	@Autowired
	PlatDataMapper platDataMapper;

	@Override
	public List<Map<String, Object>> listData(InterDort dort) {
		// TODO Auto-generated method stub
		return platDataMapper.listData(dort.getInterContent(), dort.getInterSoure(),dort.getInterCondition());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Page listData(Query query, InterDort dort) {
		// TODO Auto-generated method stub
		query.setRecords(platDataMapper.listData(query, dort.getInterContent(), dort.getInterSoure(), dort.getInterCondition()));
		return query;
	}

}
