import org.apache.log4j.Logger;

public abstract class ElectricBike extends Vehicle {
	private static final Logger log=Logger.getLogger(ElectricBike.class);
	
	public void fixHandle() {
		log.info("FixHandle");
	}
	public void fixSeats() {
		log.info("FixSeats");
	}
	public void fixWheels() {
		log.info("FixWheels");
	}
	public void fixBody() {
		log.info("FixBody");
	}
	public void fixAccelator() {
		log.info("FixAccelator");
	}
	public void fixBreak() {
		log.info("FixBreak");
	}

}
