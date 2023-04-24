package retval;

import java.util.function.Function;
import java.util.function.Predicate;

public class Runner {
	// Predicate function
    static Predicate<Integer> isEven = x -> 0 == x %2;
    
    // Static method that returns a predicate function
    static Predicate<Integer> f()  { return isEven;}
    
	public static void main(String[] args) {
		Predicate<Integer> func = null;
		func = f();
		System.out.println("     Even test for 5 = " + func.test(5));

	}

}
