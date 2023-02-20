import org.apache.log4j.Logger;

public class Plan {
	private static Logger log = Logger.getLogger(Plan.class);

	public static void main(String[] args) {
		log.debug("Developer");
		log.info("Senior Developer");
		log.error("Technical Lead");
		log.fatal("Technical Manager");
	}

}
