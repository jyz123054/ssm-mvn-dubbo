package org.ssm.mvn.dubbo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.ssm.mvn.dubbo.api.entity.OrderEntity;
import org.ssm.mvn.dubbo.api.entity.UserEntity;
import org.ssm.mvn.dubbo.api.service.IOrderService;
import org.ssm.mvn.dubbo.api.service.IUserService;
import org.ssm.mvn.dubbo.user.dao.UserMapper;

//import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.annotation.Reference;

@Service //使用dubbo注解方式时
//@Service
public class IUserServiceImpl implements IUserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Reference
	private IOrderService orderService;
	
	@Override
	public UserEntity getUserInfo(Long id) {
		OrderEntity o = orderService.getOrderInfo(id);
		System.out.println(o.getDescription());
		return userMapper.getUserInfo(id);
	}

}
