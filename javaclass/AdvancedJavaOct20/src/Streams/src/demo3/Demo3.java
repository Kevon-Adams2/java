package demo3;

import java.util.Arrays;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4,5,2,8,1,3,6);
		int total = numbers.stream()
				.filter(x -> 0 == x %2)
				.map(x -> x * x)
				.sorted()
				.reduce(0,(sum,val) -> sum + val);
        System.out.println("Total is " + total);

	}

}
