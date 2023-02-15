class Person {
	int age ;
	String name;
	double weight;
	double height;
	Person()
	{
	System.out.println("no arg");
	}
	public static void main(String args[]){
	
Person p1 = new Person();
p1.age =  27;
p1.name =  "sasi";
p1.weight = 55.02;
p1.height = 5.7; 
System.out.println(p1.age);
System.out.println(p1.name);
System.out.println(p1.weight);
System.out.println(p1.height);
}
}