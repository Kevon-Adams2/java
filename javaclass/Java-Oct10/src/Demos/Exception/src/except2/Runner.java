package except2;

public class Runner {

	public static void main(String[] args) {
		
		Alpha a = new Alpha();
		a.f();
		

	}

}




class Alpha { 
	public void f() {
		try  {
		this.h();
		System.out.println("After call to h()"); 
		}  catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void h() throws Exception {
		System.out.println("In h()");
		this.g();
	}
	
	public void g() throws Exception {
		System.out.println("Before in g()");
		if (4 == 4 ) throw new Exception();
		System.out.println("After");
		
	}
}
