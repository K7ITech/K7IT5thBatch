import org.apache.log4j.Logger;

public  abstract  class Car extends Vehicle {
	private static final Logger log=Logger.getLogger(Car.class);
	
	public void fixHandle() {
		log.info("Fixing Car Handle");
	}
	public void fixSeats() {
		log.info("Fixing Car Seats");
	}
	public void fixWheels() {
		log.info("Fixing Car Wheels");
	}
	public void fixEngine() {
		log.info("Fixing Car Engine");
	}
	public void fixAccelator() {
		log.info("Fixing Car Accelator");
	}
	public void fixBody() {
		log.info("Fixing Car Body");
	}

}
