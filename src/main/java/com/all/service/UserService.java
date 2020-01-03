package com.all.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.all.dto.UserDTO;
import com.all.model.User;
import com.all.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private BCryptPasswordEncoder passEncod;

	@Autowired
	private UserRepository user;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.user = userRepository;
	}

	public User insert(User userObj) {
		userObj.setUserId(null);
		return user.save(userObj);
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getUserId(), objDto.getEmail(), objDto.getName(), passEncod.encode(objDto.getPassword()),
				objDto.getMovies());
	}

	public List<User> findAll() {
		return user.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
		 User userAut = Optional.ofNullable(user.findByEmail(userEmail))
	                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
	        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
	        //List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
	        return new org.springframework.security.core.userdetails.User
	                (userAut.getEmail(), userAut.getPassword(), authorityListAdmin);

	}

}
