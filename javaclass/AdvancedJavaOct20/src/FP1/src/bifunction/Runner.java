package bifunction;

import java.util.function.BiFunction;

public class Runner {

	public static BiFunction<Integer,Integer,Integer> bi;
	public static void main(String[] args) {
		bi = (x,y) -> x * y;
		System.out.println(bi.apply(2,3) + " Address of bi " + bi);

	}

}
