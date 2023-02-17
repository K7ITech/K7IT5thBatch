import org.apache.log4j.Logger;

public class LogPractice {
private static Logger log=Logger.getLogger(LogPractice.class);
	public static void main(String[] args) {
		log.debug("Debug Message");
		log.info("Info Message");
		log.error("Error Message");
		log.fatal("Fetal Message");

	}

}
