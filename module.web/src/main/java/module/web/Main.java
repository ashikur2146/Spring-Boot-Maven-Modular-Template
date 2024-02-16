package module.web;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		LOGGER.info("### application is going to be started ###");
		SpringApplication.run(Main.class, args);
	}

}