
public class Runner {

	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());

	}

}

class Singleton {
	
    static private Singleton s = null;
    
    static public Singleton getSingleton() {
    	if (Singleton.s == null) Singleton.s = new Singleton();
    	return Singleton.s;
    }
   
    private Singleton() {}
	
}