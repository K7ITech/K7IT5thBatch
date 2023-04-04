
public class PersonManager1 {
	public static void main(String[] args) {
		
	

	Person p1 = new Person(10, "k7it", 5.7, 55.5);
	Person p2 = new Person(20, "sasi", 5.0, 77.2);
	Person p3 = new Person(10, "sasi", 5.7, 55.5);
	Person p4 = p1;

	System.out.println(p1 == p2);
	System.out.println(p1 == p3);
	System.out.println(p2 == p3);
	System.out.println(p1 == p4);

}

}

