import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Runner {

	public static void main(String[] args) {
	Box<String> sb = new Box<>("Hi");
	Box<Integer> ib = new Box<>(9);

	Set<Integer> al = new TreeSet<>();

	int [] a = {1,2,3, 4, 5};
	
	for (int j : a) {
		System.out.println(j);
		
	}
		
	}
//    static public int add(int i, int j) {
//    	return i + j;
//    }
//    static public float add(float i, float j) {
//    	return i +j;
//    }
//    
//    static public String add(String i, String j) {
//    	return i +j;
//    }
    
//    static public <T> T add( T i, T j) {
//    	return i + j;
//    }
//        
}

class Box<T> {
	private T i;

	public Box(T i) {
		this.i = i;
	}

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
}
