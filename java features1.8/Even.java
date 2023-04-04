package resource;

import java.util.function.Predicate;

public class Even1 {

public static void main(String args[]){
    
Predicate<Integer> predicate = (n)->n%2==0;

System.out.println("200 is even number:"+predicate.test(200));
System.out.println("201 is even number:"+predicate.test(201));
System.out.println("500 is even number:"+predicate.test(501));
	}
}


