
public class FunctionalInterface {
	public static boolean isEvenNumber(int n) {
		return n%2==0;
	}

	public static void main(String[] args) {
		Accounts a1=new Accounts();
		System.out.println("Sum of 5,6 is:"+a1.add(5,6));
		
		Calculator1 c1= new Accounts();
		System.out.println("Sum of 10,20 is:"+c1.add(10,20));
		
		Calculator1 c2= new Accounts();
		System.out.println("Sum of 30,40 is:"+c2.add(30,40));
		
		
		
		

	}

}
