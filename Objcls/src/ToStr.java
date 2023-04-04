
public class ToStr{
int age;
String name;
double ht;
double wt;
public ToStr(int age, String name, double ht, double wt) {
	super();
	this.age = age;
	this.name = name;
	this.ht = ht;
	this.wt = wt;
}
@Override
public String toString() {
	return "ToStr [age=" + age + ", name=" + name + ", ht=" + ht + ", wt=" + wt + "]";
}

}

