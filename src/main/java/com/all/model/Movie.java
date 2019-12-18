package com.all.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "MOVIE")
public class Movie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MOVIE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;

	@Column(name = "TITLE", length = 300, nullable = false)
	private String title;

	@Column(name = "DIRECTOR", length = 50, nullable = false)
	private String director;

	@Column(name = "STORE_ID", nullable = false)
	private String storeId;
	
	@Column(name = "USER_ID")
	private String userId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STORE_ID", referencedColumnName = "STORE_ID", updatable = false, insertable = false)
	private Store store;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID", updatable = false, insertable = false)
	private User user;

}
