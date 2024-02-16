package module.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import module.core.Calculate;
import module.core.CalculateServiceImpl;

@Component
@Import(CalculateServiceImpl.class)
public class Index {

	private final List<Number> numbers = Arrays.asList(2, 3, 4, 5);
	
	private Calculate<List<Number>, Double> calculate;

	public Index(Calculate<List<Number>, Double> calculate) {
		super();
		this.calculate = calculate;
	}

	@GetMapping("/index")
	public String index() throws Exception {
		return "Application is running. Sum is: " + calculate.calculate(numbers);
	}
}
