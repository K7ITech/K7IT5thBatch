
public class Person1 {
	private int age;
	private String name;
	private double height;
	private double weight;
	Person1(int age, String name,double height,double weight)
	{
		this.age=age;
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
	@Override
	public String toString() {
		return "Person1 [age=" + age + ", name=" + name + ", "
				+ "height=" + height + ", weight=" + weight + "]";
	}
	public boolean equals(Object obj){
		
		Person1 p1=(Person1)obj;
		
		return this.age==p1.age && this.name.equals(p1.name) &&
				this.height==p1.height && this.weight==p1.weight;
		
	}

}
