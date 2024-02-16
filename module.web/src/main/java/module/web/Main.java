package module.web;

import java.util.Arrays;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import module.core.Sum;

@SpringBootApplication
@RestController
@RequestMapping("/public/api/v1")
public class Main {
	
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	@GetMapping("/index")
	public String index() throws Exception {
		return "Application is running. Sum is: " + new Sum().calculate(Arrays.asList(2,3,4,5)) ;
	}

	public static void main(String[] args) {
		LOGGER.info("### application is going to be started ###");
		SpringApplication.run(Main.class, args);
	}
}