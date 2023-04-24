package car3;

public class Car {
	
	private Engine myEngine;
	private Transmission myTranny;
	private Electical myElecticSys;
	private String VIN;
	
	public Car(boolean automatic) {
		this.myTranny = new Transmission(automatic);
	}
	
	public void shiftGear(String newGear) {
		this.myTranny.shiftGear(newGear);
	}
	
	public void toggleLights() {
		this.myElecticSys.lightsToggle();
	}
	
	
	

}



class Engine {}

class Transmission{
	private boolean automatic;
	Transmission(boolean automatic) {
		this.automatic = automatic;
	}
	public void shiftGear(String newGear) {}
}

class Electical {
	
	private Alternator myAlt;
	private Battery myBatt;
	
	public void lightsToggle() {}
}