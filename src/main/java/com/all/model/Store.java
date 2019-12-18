package com.all.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "STORE")
public class Store implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "STORE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer storeId;

	@OneToMany(mappedBy = "store", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Movie> movies;

	public Store() {
		movies = new ArrayList<>();
	}

}
