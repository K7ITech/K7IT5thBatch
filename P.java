class P{
	static int head;
    int age;
    double height;
    double weight;

double getRunrate()
{
	return (height * weight)/age;
}
public static void main(String args[])
{
	P p = new P();
	p.head = 1;
	p.age = 22;
	p.height = 5.5;
	p.weight = 74;
		System.out.println(p.head);
		System.out.println(p.age);
		System.out.println(p.height);
		System.out.println(p.weight);
    double Runrate = getRunrate();
	System.out.println(Runrate);
		}
}
