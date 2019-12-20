package com.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.dto.UserDTO;
import com.all.model.User;
import com.all.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository user;
	
	public User insert(User userObj) {
		userObj.setUserId(null);
		return user.save(userObj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getUserId(), objDto.getEmail(), objDto.getName(), objDto.getPassword(), objDto.getMovies());
	}

}
