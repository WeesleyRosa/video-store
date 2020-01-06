package com.all;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.all.model.Movie;
import com.all.model.Store;
import com.all.model.User;
import com.all.repository.MovieRepository;
import com.all.repository.StoreRepository;
import com.all.repository.UserRepository;

@RestController
@SpringBootApplication
public class VideoStoreApplication implements CommandLineRunner {

	@Autowired
	private StoreRepository storeRepo;

	@Autowired
	private MovieRepository movieRepo;

	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/")
	String hello() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(VideoStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Store store1 = new Store(null);
		Store store2 = new Store(null);
		Store store3 = new Store(null);

		User user1 = new User(null, "emailcaracteres", "nomegrandeaqui", "senha10eee", null);

		Movie movie1 = new Movie("title1caracteresae", "director1caracteresae", 1, null);
		Movie movie2 = new Movie("titlecaracteresae2", "director2caracteresae", 2, null);
		Movie movie3 = new Movie("titlecaracteresae3", "director3caracteresae", 3, 1);

		userRepo.saveAll(Arrays.asList(user1));
		storeRepo.saveAll(Arrays.asList(store1, store2, store3));
		movieRepo.saveAll(Arrays.asList(movie1, movie2, movie3));

	}

}
