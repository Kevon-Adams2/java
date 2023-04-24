package chaos;

public class Runner {
  public  static void main(String[] args) {
	Child c = new Child();
  }
	}



class Parent {
	private B b = new B();
	Parent() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	private B b = new B();
	Child() {
		System.out.println("Child");
	}
}

class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B");
	}
}

