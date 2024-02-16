package module.core;

import java.util.List;

public class Sum implements Calculate<List<? extends Number>, Double> {

	@Override
	public Double calculate(List<? extends Number> k) throws Exception {
		 double sum = k.stream()
                 .mapToDouble(Number::doubleValue)
                 .sum();
   return sum;
	}
}
