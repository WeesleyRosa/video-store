package com.all.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.all.model.Movie;

public class MovieDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer movieId;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres")
	private String title;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres")
	private String director;

	private String storeId;

	private String userId;

	public MovieDTO(Movie movieObj) {
		super();
		movieId = movieObj.getMovieId();
		title = movieObj.getTitle();
		director = movieObj.getDirector();
		storeId = movieObj.getStoreId();
		userId = movieObj.getUserId();
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
