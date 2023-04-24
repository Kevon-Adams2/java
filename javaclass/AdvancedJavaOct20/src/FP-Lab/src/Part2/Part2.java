package Part2;

import java.util.function.Function;

public class Part2 {
   
	static Function<Integer,Integer> square = x -> x * x;
	static Function<Integer,Integer> other;
	
	public static void main(String[] args) {
		other = square;
		System.out.println("--> " + other.apply(5));

	}

}
