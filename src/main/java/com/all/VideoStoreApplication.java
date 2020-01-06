package com.all;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.all.model.Movie;
import com.all.model.Store;
import com.all.model.User;
import com.all.repository.MovieRepository;
import com.all.repository.StoreRepository;
import com.all.repository.UserRepository;

@SpringBootApplication
public class VideoStoreApplication implements CommandLineRunner {

	@Autowired
	private StoreRepository storeRepo;

	@Autowired
	private MovieRepository movieRepo;

	@Autowired
	private UserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(VideoStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Store store1 = new Store(null);
		Store store2 = new Store(null);
		Store store3 = new Store(null);
		Store store4 = new Store(null);
		Store store5 = new Store(null);
		Store store6 = new Store(null);
		Store store7 = new Store(null);
		Store store8 = new Store(null);
		Store store9 = new Store(null);
		Store store10 = new Store(null);
		Store store11 = new Store(null);
		Store store12 = new Store(null);

		User user1 = new User(null, "email1@hotmail.com", "Nome 1 da rosa", "senha1teste", null);
		User user2 = new User(null, "email2@hotmail.com", "Nome 2 da rosa", "senha2teste", null);
		User user3 = new User(null, "email3@hotmail.com", "Nome 3 da rosa", "senha3teste", null);
		User user4 = new User(null, "email4@hotmail.com", "Nome 4 da rosa", "senha4teste", null);
		User user5 = new User(null, "email5@hotmail.com", "Nome 5 da rosa", "senha5teste", null);
		User user6 = new User(null, "email6@hotmail.com", "Nome 6 da rosa", "senha6teste", null);
		User user7 = new User(null, "email7@hotmail.com", "Nome 7 da rosa", "senha7teste", null);

		Movie movie1 = new Movie("Filme 1 algum genero", "Diretor do filme 1", 1, 1);
		Movie movie2 = new Movie("Filme 2 algum genero", "Diretor do filme 2", 1, 2);
		Movie movie3 = new Movie("Filme 3 algum genero", "Diretor do filme 3", 2, 1);
		Movie movie4 = new Movie("Filme 4 algum genero", "Diretor do filme 4", 3, 2);
		Movie movie5 = new Movie("Filme 5 algum genero", "Diretor do filme 5", 4, null);
		Movie movie6 = new Movie("Filme 6 algum genero", "Diretor do filme 6", 5, 3);
		Movie movie7 = new Movie("Filme 7 algum genero", "Diretor do filme 7", 1, 4);
		Movie movie8 = new Movie("Filme 8 algum genero", "Diretor do filme 8", 2, 5);
		Movie movie9 = new Movie("Filme 9 algum genero", "Diretor do filme 9", 6, 1);
		Movie movie10 = new Movie("Filme 10 algum genero", "Diretor do filme 10", 7, 6);
		Movie movie11 = new Movie("Filme 11 algum genero", "Diretor do filme 11", 8, null);
		Movie movie12 = new Movie("Filme 12 algum genero", "Diretor do filme 12", 9, 3);
		Movie movie13 = new Movie("Filme 13 algum genero", "Diretor do filme 13", 10, 4);
		Movie movie14 = new Movie("Filme 14 algum genero", "Diretor do filme 14", 11, null);
		Movie movie15 = new Movie("Filme 15 algum genero", "Diretor do filme 15", 12, 1);

		userRepo.saveAll(Arrays.asList(user1, user2, user3, user4, user5, user6, user7));
		storeRepo.saveAll(Arrays.asList(store1, store2, store3, store4, store5, store6, store7, store8, store9, store10,
				store11, store12));
		movieRepo.saveAll(Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10,
				movie11, movie12, movie13, movie14, movie15));

	}

}
