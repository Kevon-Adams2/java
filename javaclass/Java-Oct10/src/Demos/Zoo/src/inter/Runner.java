package inter;

public class Runner {

	public static void main(String[] args) {
		Swimmer [] wetAnimals = { new Dog(), new Duck() };
		wetAnimals[0].swim();
		Pet d = (Dog)wetAnimals[0];
		d.speak();
		wetAnimals[1].swim();
		

	}

}

interface thing {} //marker interface

interface Pet extends thing {
    public default String speak() {
    	String s =  "Odd noises";
    	return s;
    }
    public static void dummy() {
    	System.out.println("Dummy");
    }
}

interface Swimmer extends Pet{
	public void swim();
}

interface Flyer extends thing {
	public void fly();
}

class Animal implements thing{}

class Duck implements Swimmer {

	@Override
	public void swim() {
		System.out.println("Dive for fish");
		
	}
	
}

class Dog extends Animal implements Swimmer, Pet {

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Bark";
	}

	@Override
	public void swim() {
		System.out.println("Dog padddle");
		
	}
	
}


