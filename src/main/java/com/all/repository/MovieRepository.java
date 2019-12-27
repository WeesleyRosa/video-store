package com.all.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.all.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
	
	List<Movie> findByUserIdIsNull();
	
	Movie findByTitle(String title);

}
