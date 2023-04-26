import java.util.function.Function;

public class CalculatorAdd {

	public static void main(String[] args) {
		Function<Integer,Integer>squared=(n) -> {return n*n;};
		System.out.println("square of 4:"+squared.apply(4));
		System.out.println("square of 5:"+squared.apply(5));
		
		

	}

}
