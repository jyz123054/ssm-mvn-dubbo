package org.ssm.mvn.dubbo.api.service;

import org.ssm.mvn.dubbo.api.entity.UserEntity;

public interface IUserService {
	public UserEntity getUserInfo(Long id);
}
