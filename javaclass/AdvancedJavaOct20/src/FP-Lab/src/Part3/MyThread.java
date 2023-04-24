package Part3;

public class MyThread {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Look ma, no variables!!")).start();

	}

}
