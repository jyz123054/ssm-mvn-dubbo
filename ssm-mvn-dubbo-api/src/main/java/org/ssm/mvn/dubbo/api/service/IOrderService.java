package org.ssm.mvn.dubbo.api.service;

import org.ssm.mvn.dubbo.api.entity.OrderEntity;

public interface IOrderService {
	public OrderEntity getOrderInfo(Long id);
}
