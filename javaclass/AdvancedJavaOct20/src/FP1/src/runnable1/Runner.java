package runnable1;

class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("      Running in " + Thread.currentThread());		
	}
	
}
public class Runner {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		t.start();
	}

}
