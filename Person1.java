import org.apache.log4j.Logger;

public class Person1 {
private static Logger log = Logger.getLogger(Person1.class);
	public static void main(String[] args) {
     log.debug("Lucky");
     log.info("Mahi");
	log.error("Vamsi");
    log.fatal("Kamasani");
}
}
