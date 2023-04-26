
public class PersonManager1 {

	public static void main(String[] args) {
		Person1 p1=new Person1(10,"K7it",5.7,50.25);
		Person1 p2=new Person1(20,"Deepya",5.3,55.25);
		Person1 p3=new Person1(20,"Deepya",5.3,55.25);
		Person1 p4=p1;
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p2==p3);
		System.out.println(p1==p4);

	}

}
