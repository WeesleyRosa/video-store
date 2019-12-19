package com.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.all.repository.StoreRepository;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

	@Autowired
	private StoreRepository store;

}
