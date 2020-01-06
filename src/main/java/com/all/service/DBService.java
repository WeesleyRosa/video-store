package com.all.service;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.model.Movie;
import com.all.model.Store;
import com.all.model.User;
import com.all.repository.MovieRepository;
import com.all.repository.StoreRepository;
import com.all.repository.UserRepository;

@Service
public class DBService {

//	@Autowired
//	private BCryptPasswordEncoder passEncod;

	@Autowired
	private MovieRepository movieRepo;
	
	@Autowired
	private StoreRepository storeRepo;
	
	@Autowired
	private UserRepository userRepo;

//	public void instantiateTestDatabase() throws ParseException {
//		Movie m1 = new Movie();
//		Store s1 = new Store();
//		User s1 = new User();
//	}
}
