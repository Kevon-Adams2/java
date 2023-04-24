package Demo2;

import java.util.Arrays;
import java.util.List;


public class demo2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4,5,2,8,1,3,6);
		numbers.stream()
				.filter(x -> 0 == x %2)
				.map(x -> x * x)
				.sorted()
				.forEach(x -> System.out.println(x));
    
	}
}
