package runnable1;

public class Runner2 {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("      Running in " + Thread.currentThread());
		Thread t = new Thread(r);
		t.start();
	}

}

// s