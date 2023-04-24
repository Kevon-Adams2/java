package string;

public class Runner {

	public static void main(String[] args) {
		
		StringBuilder result = new StringBuilder("");
		System.out.println(result.capacity());
		for (int i = 0; i < 10 ; ++i) {
			result.append(i);
			result.append(" ");
		}
		result.append("\n");
		System.out.println(result);
		String s = result.toString();
		System.out.println(result.getClass());
		System.out.println(s.getClass());
		
		
	}

}
