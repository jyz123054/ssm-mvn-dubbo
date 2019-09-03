package org.ssm.mvn.dubbo.api.entity;

import java.io.Serializable;

public class OrderEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7793835989025912798L;

	private Long oid;
	
	private String description;

	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
