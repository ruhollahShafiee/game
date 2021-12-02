package com.kalamba.game;

import com.kalamba.game.repository.GameRepository;
import com.kalamba.game.repository.UserRepository;
import com.kalamba.game.repository.model.Game;
import com.kalamba.game.repository.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

}

@Component
class InitializingCommandLineRunner implements CommandLineRunner {

	@Autowired
	GameRepository gameRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args){

		List<Game> game= Arrays.asList(new Game("penalty challenge","p.c","Just shoot the ball")
				,new Game("magic tiles","m.t","playing the piano"));
		User user=new User("1234","r.shafiee","ruhollah","shafiee");
		gameRepository.saveAll(game);
		userRepository.save(user);


	}



}
