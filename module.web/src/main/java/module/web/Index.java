package module.web;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import module.core.Calculate;
import module.core.CalculateServiceImpl;

@Component
@Import(CalculateServiceImpl.class)
@RequestMapping("/public/api/v1")
@RestController
public class Index {

	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	private final List<Number> numbers = Arrays.asList(2, 3, 4, 5);
	
	private Calculate<List<Number>, Double> calculate;

	public Index(Calculate<List<Number>, Double> calculate) {
		super();
		this.calculate = calculate;
	}

	@GetMapping("/index")
	public String index() throws Exception {
		LOGGER.info("~::index is called::~");
		return "Application is running. Sum is: " + calculate.calculate(numbers);
	}
}
