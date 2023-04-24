package imperative;

class MyFunctions {
	static int power(int base, int exponent) {
		if (exponent <= 0 ) return 1;
		int p = base;
		for (int i = 1; i < exponent; i++) {
			p = p * base;
		}
		return p;
	}
}

public class Runner {

	public static void main(String[] args) {
		System.out.println(MyFunctions.power(3, 3));

	}

}
