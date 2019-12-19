package com.all.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.all.model.User;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer useId;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 10, max = 100, message = "O tamanho do email deve ser entre 10 e 100 caracteres")
	private String email;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 1, max = 100, message = "Tamanho do nome deve ser no máximo 100 caracteres ")
	private String name;

	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 6, max = 20, message = "O tamanho da senha deve ser entre 6 e 20 caracteres")
	private String password;

	public UserDTO(User userObj) {
		useId = userObj.getUserId();
		email = userObj.getEmail();
		name = userObj.getName();
		password = userObj.getPassword();
	}

	public Integer getUseId() {
		return useId;
	}

	public void setUseId(Integer useId) {
		this.useId = useId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
