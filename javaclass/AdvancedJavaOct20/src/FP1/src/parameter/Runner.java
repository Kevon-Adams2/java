package parameter;

import java.util.function.Function;

public class Runner {
	 // function takes a function and a numeric argument
	static Function<Integer,Integer> square = x -> x * x;
	static Function<Integer,Integer> cube = x -> x * x * x;

	static int f(Function<Integer,Integer> func, int arg ) {
		return func.apply(arg);
	}
	public static void main(String[] args) {
		System.out.println("    Squaring " + f(square,4));
		System.out.println("    Cubing " + f(cube,4));
		System.out.println("    Adding one " + f(x -> x + 1,4));

	}

}
