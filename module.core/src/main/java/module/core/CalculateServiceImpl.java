package module.core;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements Calculate<List<Number>, Double> {
	@Override
	public Double calculate(List<Number> k) throws Exception {
		return k.stream().mapToDouble(Number::doubleValue).sum();
	}
}
