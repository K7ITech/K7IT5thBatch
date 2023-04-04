import org.apache.log4j.Logger;

public abstract interface Vehicle {
	static final Logger log = Logger.getLogger(Vehicle.class);

	public abstract void fixHandle();
	public abstract void fixSeats();
	public abstract void fixWheels();
	public abstract void fixBody();
	public abstract void fixgear();
	public abstract void fixBreak(); 
	public abstract void fixAdvNumberPlate12();
	
	public default void fixnewLights() {
		log.info("Fixing new lights");
	}
	public static int numberOfLights(){
		return 3;
}
}