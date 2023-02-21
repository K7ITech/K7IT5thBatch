import org.apache.log4j.Logger;

public abstract class Lorry extends Vehicle {
	private static final Logger log=Logger.getLogger(Lorry.class);
	
	public void fixHandle() {
		log.info("Fixing Lorry Handle");
	}
	public void fixSeats() {
		log.info("Fixing Lorry Seats");
	}
	public void fixWheels() {
		log.info("Fixing Lorry Wheels");
	}
	public void fixEngine() {
		log.info("Fixing Lorry Engine");
	}
	public void fixAccelator() {
		log.info("Fixing Lorry Accelator");
	}
	public void fixBreak() {
		log.info("Fixing Lorry Break");
	}

}

