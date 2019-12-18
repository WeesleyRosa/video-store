package com.all.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.model.Store;
import com.all.repository.StoreRepository;

@Service

public class StoreService {
	
	@Autowired
	private StoreRepository store;
	
	

}
