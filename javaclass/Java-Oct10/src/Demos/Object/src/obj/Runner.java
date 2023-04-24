package obj;

public class Runner {

	public static void main(String[] args) {
		Person bob = new Person("Bob",56343);
		Person joe = new Person("Joe",56343);
		System.out.println(bob);
		Person robbie = bob;
		System.out.println(joe);
		System.out.println(bob == joe);
		System.out.println(bob.equals(joe));

	}

}



class Person {
	private int id;
	private String name;
	
	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	Person() {}
	
	protected void setName(String newName) {
		this.name = newName;
	}
	
	public boolean equals(Person other) {
		return this.id == other.id;
	}
	
	
	public Person clone() {
		Person c = new Person(this.name, this.id);
		return c;
	}
	
	int compare(Person other) {
		if (this.equals(other)) return 0;
		if (this.id < other.id) return -1;
		return 1;
	}
	
	public String toString() {
	return this.name+" is " + this.id + " id ";
	}
}

class Employee extends Person {
	private String job;
	

	public Employee(String name, int id, String job) {
		super(name, id);
		this.job = job;

	}
	
	public void setName(String name) {
		super.setName(name);
		// write a messate that name was
	}
	
	
}

