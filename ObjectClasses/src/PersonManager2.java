
public class PersonManager2 {

	public static void main(String[] args) {
		Person2 p1=new Person2(10,"K7it",5.7,50.25);
		Person2 p2=new Person2(20,"Deepya",5.3,55.25);
		Person2 p3=new Person2(20,"Deepya",5.3,55.25);
		Person2 p4=p1;
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println(p1.Hashcode()==p2.Hashcode());
		System.out.println(p1.Hashcode()==p3.Hashcode());
		System.out.println(p2.Hashcode()==p3.Hashcode());
		System.out.println(p1.Hashcode()==p4.Hashcode());

	}

}
