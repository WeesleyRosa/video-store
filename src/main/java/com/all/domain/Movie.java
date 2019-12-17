package com.all.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "TITLE", length = 300)
	private String title;
	
	@Column(name = "DIRECTOR", length = 50)
	private String director;

}
