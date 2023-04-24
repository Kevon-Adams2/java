
public class Runner {

	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		a.f();
		

	}

}

class MyException extends Exception {}
class MyOtherException extends RuntimeException{};

class Alpha {
	public void f() {
		//System.out.println("In f()");

		try {
			// opens a file for writing
			//System.out.println("In f() open files");
			// write to file
			if ( 4 == 4) throw new Exception("Bad stuff");
			// close the file
		} catch (RuntimeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e.getStackTrace().toString());
		} finally {
			//System.out.println("In f() close files");
		}
		//System.out.println("In f() after try block");
	}
}