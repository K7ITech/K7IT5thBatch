

public class Person1 {
	Person1()
	{
		System.out.println("no arg");
	}
	Person1(int i){
		System.out.println("int type constructor");
		
	}
	public static void main(String[] args) {
		Person1 p=new Person1();
		Person1 P1=new Person1(100);
		
	}
}
