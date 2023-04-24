package zoo;

public class Runner {

	public static void main(String[] args) {
		Husky fido = new Husky();
		System.out.println(fido.speak());
		//Pet p = new Pet();
		//System.out.println(p.speak());

	}

}


class Pet {   // superclass, base, parent
	private String name;
	String speak() {
		return "Sounds";
	}
}

class Dog extends Pet {  //subclass, derived,child
//	 @Override
//	String speak() {
//		return "Bark";
//	}
}

class Husky extends Dog {
	
}



// illustration of what the dog looks like ins
class DogImpl {
	private Pet parent = new Pet();
	String speak() {
		return "Bark";
	}
}

