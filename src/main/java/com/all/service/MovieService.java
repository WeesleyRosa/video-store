package com.all.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.model.Movie;
import com.all.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movie;
	
	public List<Movie> findAllAvailable() {
		return movie.findByUserIdIsNull();
	}

}
