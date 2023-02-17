class Person2{
static int legs;
static String food;
public static void main(String args[]){
Person2 p1=new Person2();
p1.legs=2;
p1.food="Rice";
Person2 p2=new Person2();
p2.legs=4;
p2.food="Grass";
System.out.println(p1.legs);
System.out.println(p1.food);
System.out.println(p2.legs);
System.out.println(p2.food);
Person2 p3=new Person2();
System.out.println(p3.legs);
System.out.println(p3.food);
}
}
