package com.all.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.all.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
