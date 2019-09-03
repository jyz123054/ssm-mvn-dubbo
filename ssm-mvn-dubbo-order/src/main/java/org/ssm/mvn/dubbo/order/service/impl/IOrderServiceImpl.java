package org.ssm.mvn.dubbo.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.mvn.dubbo.api.entity.OrderEntity;
import org.ssm.mvn.dubbo.api.service.IOrderService;
import org.ssm.mvn.dubbo.order.dao.OrderMapper;

//import com.alibaba.dubbo.config.annotation.Service;
//@Service 使用dubbo注解方式时
@Service
public class IOrderServiceImpl implements IOrderService{
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public OrderEntity getOrderInfo(Long id) {
		return orderMapper.getOrderInfo(id);
	}

}
