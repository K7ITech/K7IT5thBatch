
public class StudentManager {
public static void main(String[] args) {
	Address add = new Address(17, "3rdcross", 560043);
	Student s =  new Student(01, "sunny", add);
	Student dup = s.getClone();
	
	System.out.println("oroginal:"+s);
	System.out.println("Dup:"+dup);
	System.out.println();
	dup.getAdd().setPin(517126);
	dup.setName("Vinnu");
	
	System.out.println("after modify duplicate");
	System.out.println("Original:"+s);
	System.out.println("dup:"+dup);	
}
}
