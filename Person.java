import org.apache.log4j.Logger;

public class Person {
	private static Logger log = Logger.getLogger(Person.class);

	public static void main(String[] args) {
		log.debug("Veeresh");
		log.info("Anand");
		log.error("Anu");
		log.fatal("Mahesh");
	}

}
