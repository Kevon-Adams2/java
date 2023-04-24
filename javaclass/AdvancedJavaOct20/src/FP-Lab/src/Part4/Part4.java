package Part4;
import java.util.function.Function;

public class Part4 {

	static Function<Integer,Integer> func(int arg) {
		return (x -> x + arg);
	}
	public static void main(String[] args) {
		
		Function<Integer,Integer>one = func(1);
		Function<Integer,Integer>two = func(2);
		System.out.println("     One: " + one.apply(10));
		System.out.println("     Two: " + two.apply(10));
	}

}
