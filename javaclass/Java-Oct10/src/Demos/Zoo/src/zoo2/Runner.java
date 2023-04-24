package zoo2;

public class Runner {

	public static void main(String[] args) {
		
		Object [] myPets = {new Dog(), new Cat(), new Turtle()}; 
		Dog fido = new Dog();
        fido.fetch();

    
        Object p = new Cat();
       // p.speak();
        fido = p;
        fido.fetch();
        

	}

}
abstract class Pet extends java.lang.Object {
 
	// default speak() for subclasses their
//	String speak() {
//		return "Sounds";
//	}
	// There is not default but every subclass MUST define a speak();
    //abstract speak();

	
}

class Dog extends Pet{
	private String name;
	String speak() {
		return "Bark";
	}
	void fetch() {
		System.out.println("Going for the ball");
	}
}

class Cat extends Pet{
	private String name;
	String speak() {
		return "Stoney Silence";
	}
	void hunt() {
		System.out.println("Here's a dead mouse");
	}
}

class Turtle extends Pet{}