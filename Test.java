
import org.apache.log4j.Logger;

public class Test {
   private static Logger log = Logger.getLogger(Test.class);
   
	public static void main(String[] args) {
       log.debug(args);
       log.info(args);
       log.error(args);
       log.fatal(args);
       
	}

}
