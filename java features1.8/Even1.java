import java.util.function.Predicate;

import org.apache.log4j.Logger;

public class Even1 {

public static Logger log = Logger.getLogger(Even.class) ;
public static void main(String args []) {
Predicate<Integer> predicate = (n)->n%2==0;


	log.info("200 is even number:"+predicate.test(200));
	log.info("202 is even number:"+predicate.test(202));
	log.info("501 is not even number:"+predicate.test(501));
	log.info("22 is even number:"+predicate.test(22));
	log.info("59 is  not even number:"+predicate.test(59));
			
		
	
}
}


