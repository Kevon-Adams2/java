package predicate;

import java.util.function.Predicate;

public class Runner {
    public static Predicate<Integer> isEven;
    
	public static void main(String[] args) {
		isEven = x -> 0 == x % 2 ;
         System.out.println(isEven.test(13));
	}

}
