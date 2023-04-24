package Part1;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Part1 {

	static Function<Integer,Integer> square = x -> x * x;
	static BiFunction<Integer,Integer,Integer> add = (x,y) -> x + y;
	static Predicate<Integer> isEven = x -> 0 == x % 2;
	
	public static void main(String[] args) {
		// square 2, add 1 adn check to see that the result is even
		boolean result = isEven.test(add.apply(1, square.apply(2)));
		System.out.println("Result is " + result);

	}

}
