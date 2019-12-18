package com.all.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.model.Movie;
import com.all.repository.MovieRepository;

@Service

public class MovieService {

	@Autowired
	private MovieRepository movie;

	public Movie find(Integer id) {
		Optional<Movie> obj = movie.findById(id);
		//movie.findAll()
		return obj.orElseThrow(() -> new ObjectNotFoundException(null,
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Movie.class.getName()));
	}

}
