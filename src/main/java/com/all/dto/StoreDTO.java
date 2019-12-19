package com.all.dto;

import java.io.Serializable;

import com.all.model.Store;

public class StoreDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer storeId;

	public StoreDTO(Store storeObj) {
		storeId = storeObj.getStoreId();

	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}
