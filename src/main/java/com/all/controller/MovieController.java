package com.all.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.all.dto.MovieDTO;
import com.all.model.Movie;
import com.all.service.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService movie;

	@RequestMapping(value = "/available", method = RequestMethod.GET)
	public ResponseEntity<List<MovieDTO>> find() {
		List<Movie> listMovies = movie.findAllAvailable();
		List<MovieDTO> movieDto = listMovies.stream().map(obj -> new MovieDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(movieDto);
	}

	@RequestMapping(value = "/{title}", method = RequestMethod.GET)
	public ResponseEntity<Movie> findById(@PathVariable String title) {
		Movie obj = movie.findByTitle(title);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{title}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@Valid @RequestBody MovieDTO objDto, @PathVariable String title) {
		Movie obj = movie.fromDTO(objDto);
		obj.setTitle(title);
		obj = movie.update(obj);
		return ResponseEntity.noContent().build();
	}

}
