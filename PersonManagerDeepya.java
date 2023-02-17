import org.apache.log4j.Logger;

public class PersonManagerDeepya {
	private static Logger log=Logger.getLogger(PersonManagerDeepya.class);

	public static void main(String[] args) {
		log.debug("Main Starts");
		log.info("Creating person object");
		PersonDeepya person=new PersonDeepya(27,5.6,5.9);
		log.info("Calculating the person RunRate:");
		double runRate = person.getRunRate();
		//double runRate = PersonDeepya.getRunRate();
		log.info("Person RunRate:"+runRate);
		try {
			int i=1/0;
		}
		catch(ArithmeticException e) {
			log.error(e);
		}
		log.debug("Main Ends");
				}

}
