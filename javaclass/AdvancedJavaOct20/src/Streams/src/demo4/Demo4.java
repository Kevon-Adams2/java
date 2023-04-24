package demo4;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    static int counter = 0;
    static void count () { Demo4.counter++;}
    
    public static void main(String[] args) {
		List<String> names = Arrays.asList("asb1", "aush2", "ydh3");
         
		names.stream()
		.filter(element -> { Demo4.count();return element.contains("2");});
		//.forEach(x -> System.out.println("       " + x));
		System.out.println("       Count = " + Demo4.counter);
	}

}
