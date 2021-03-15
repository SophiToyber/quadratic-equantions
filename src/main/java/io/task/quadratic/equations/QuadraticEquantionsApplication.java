package io.task.quadratic.equations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class QuadraticEquantionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuadraticEquantionsApplication.class, args);
	}

}
