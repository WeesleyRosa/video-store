package com.all.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.all.model.Movie;

public class MovieDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres")
	private String title;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres")
	private String director;

	private Integer storeId;

	private Integer userId;

	public MovieDTO(
			@NotEmpty(message = "Preenchimento obrigatório") @Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres") String title,
			@NotEmpty(message = "Preenchimento obrigatório") @Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres") String director,
			Integer storeId, Integer userId) {
		super();
		this.title = title;
		this.director = director;
		this.storeId = storeId;
		this.userId = userId;
	}

	public MovieDTO(Movie movieObj) {
		super();
		title = movieObj.getTitle();
		director = movieObj.getDirector();
		storeId = movieObj.getStoreId();
		userId = movieObj.getUserId();
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

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
