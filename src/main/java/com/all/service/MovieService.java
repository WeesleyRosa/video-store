package com.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.repository.MovieRepository;

@Service

public class MovieService {

	@Autowired
	private MovieRepository movie;

}
