class A
{
int i = 20;
void m()
{
System.out.println(i);	
}
class B extends A
{
int j = 33;
}
class M
{
	public static void main(String args[])
	{		
 B b1 = new B();
System.out.println(b1.i);
 System.out.println(b1.j);
 System.out.println();
 b1.m();
	}
}
} \