package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/v3")
	public String home() {
		return "Hello from Java Spring Boot test app";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
