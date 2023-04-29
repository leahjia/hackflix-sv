package dev.leah.hacks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HacksApplication {

	public static void main(String[] args) {
		SpringApplication.run(HacksApplication.class, args);
	}

	// Lets the framework know that this is an endpoint
	@GetMapping("/")
	public String apiRoot() {
		return "Hello from Leah!";
	}
}
