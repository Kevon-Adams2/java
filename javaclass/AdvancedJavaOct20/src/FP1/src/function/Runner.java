package function;


import java.util.function.Function;

public class Runner {
	
	public static Function<Integer,Integer> f = x -> x + 1;
	public static Function<Integer,Integer> g;

	public static void main(String[] args) {
		System.out.println(f.apply(4) + " Address of f " + f);
		f = x -> x * x;
		System.out.println(f.apply(4) + " Address of f " + f);
		g = f;
		System.out.println(g.apply(4) + " Address of g " + g);
		
		};
       
	}


