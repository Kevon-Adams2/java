package car1;

import car2.japanese.*;

public class Runner {

	public static void main(String[] args) {
//		Car c = new Car();
//		System.out.println(c);
//		c = new Car(null);
//		System.out.println(c);
		Toyota j = new Toyota();
		car2.japanese.Toyota j2 = new car2.japanese.Toyota();
		j.print();
		j2.print();
	    System.out.println(j2.getClass());
	    System.out.println(j.getClass());

	}

}


