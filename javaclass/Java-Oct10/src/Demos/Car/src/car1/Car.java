package car1;

public class Car {
	final private static int MIN_SPEED = 0;
	private static int numberOfCars;
	private int speed;
	private String make;
    
	static {
		Car.numberOfCars = 50;
	}
	
		
	
	public Car(String make) {
		this();
		if (make == null) make = "Ford";
		this.make = make;
	
		
	}
	
	public Car(String make, int speed) {
		this(make);
		if (this.speedCheck(speed)) this.speed = speed;
		
	}
	
	private Car() {
		Car.numberOfCars++;;
		
	}
	
	public int getSpeed() {
		this.printSpeed();
		return this.speed;
	}
    // setSpeed_int
	public void setSpeed(int speed) {
		if (this.speedCheck(speed)) this.speed = speed;;
		return;
	}
	  //setSpeed_null
	public void setSpeed() {
		this.speed = 55;
	}
	// setSpeed_float
	public void setSpeed(float speed) {
		this.speed = (int)speed;
		
	}
	public String toString() {
		return "Car make=" + this.make + " speed=" + this.speed + " Total cars=" + Car.numberOfCars;
	}
	private void printSpeed() {
		System.out.println(this.speed);
	}
	
	private boolean speedCheck(int speed) {
		return speed >= Car.MIN_SPEED;
	}
	

}
