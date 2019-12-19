package com.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.repository.StoreRepository;

@Service

public class StoreService {
	
	@Autowired
	private StoreRepository store;
	
	

}
