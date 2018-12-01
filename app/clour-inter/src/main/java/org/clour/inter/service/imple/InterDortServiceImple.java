package org.clour.inter.service.imple;

import org.clour.inter.mapper.InterDortMapper;
import org.clour.inter.model.entity.InterDort;
import org.clour.inter.service.InterDortService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

@Service
public class InterDortServiceImple extends ServiceImpl<InterDortMapper, InterDort> implements InterDortService {

}
