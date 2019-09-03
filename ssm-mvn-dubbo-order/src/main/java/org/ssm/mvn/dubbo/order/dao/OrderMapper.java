package org.ssm.mvn.dubbo.order.dao;

import org.ssm.mvn.dubbo.api.entity.OrderEntity;

public interface OrderMapper {
	public OrderEntity getOrderInfo(Long id);
}
