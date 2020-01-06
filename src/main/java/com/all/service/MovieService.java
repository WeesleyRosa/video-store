package com.all.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.dto.MovieDTO;
import com.all.model.Movie;
import com.all.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movie;

	public List<Movie> findAllAvailable() {
		return movie.findByUserIdIsNull();
	}

	public Movie findByTitle(String title) {
		Movie movieObj = movie.findByTitle(title);
		return movieObj;
	}

	public Movie fromDTO(MovieDTO objDto) {
		return new Movie(objDto.getTitle(), objDto.getDirector(), objDto.getStoreId(), objDto.getUserId());
	}

	public Movie find(String title) {
		Optional<Movie> obj = movie.findById(title);
		return obj.orElseThrow(() -> new IllegalStateException(
				"Objeto não encontrado! Título: " + title + ", Tipo: " + Movie.class.getName()));
	}

	public Movie update(Movie obj) {
		Movie newObj = find(obj.getTitle());
		updateData(newObj, obj);
		return movie.save(newObj);
	}
	
	private void updateData(Movie newObj, Movie obj) {
		newObj.setUserId(obj.getUserId());
	}

}
