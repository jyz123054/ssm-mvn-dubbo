package org.ssm.mvn.dubbo.user.dao;

import org.ssm.mvn.dubbo.api.entity.UserEntity;

public interface UserMapper {
	public UserEntity getUserInfo(Long id);
}
