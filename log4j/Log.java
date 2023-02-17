import org.apache.log4j.Logger;

public class Log {

	private static Logger log =Logger.getLogger(Log.class); 
	public static void main(String[] args) {
		log.debug("Apple");
		log.info("Flowers");
		log.error("Animals");
		log.fatal("Fruits");
		

	}

}
