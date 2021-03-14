package eu.techmoodivns.opi;

import eu.techmoodivns.support.cors.CorsConfiguration;
import eu.techmoodivns.support.data.DataConfiguration;
import eu.techmoodivns.support.mongo.MongoConfiguration;
import eu.techmoodivns.support.random.RandomConfiguration;
import eu.techmoodivns.support.security.SecurityConfiguration;
import eu.techmoodivns.support.validation.ValidationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableMongoRepositories
@Configuration
@Import({
		RandomConfiguration.class,
		ValidationConfiguration.class,
		CorsConfiguration.class,
		MongoConfiguration.class,
		DataConfiguration.class,
		SecurityConfiguration.class
})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
