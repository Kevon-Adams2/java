package demo1;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> square = x -> x * x;
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> squares = numbers.stream()
				//.map(x -> x * x)  
				.map(square)
				.collect(Collectors.toList());
        System.out.println(squares);
	}

}
