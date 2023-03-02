
public class Person2 {
	private int age;
	private String name;
	private double height;
	private double weight;
	Person2(int age, String name,double height,double weight)
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
		
		Person2 p2=(Person2)obj;
		
		return this.age==p2.age && this.name.equals(p2.name) &&
				this.height==p2.height && this.weight==p2.weight;	
	}
	
	public int Hashcode() {
		String strAge=" "+age;
		String strHeight=" "+this.height;
		String strWeight=" "+this.weight;
		int ageHashcode=strAge.hashCode();
		int nameHashcode=name.hashCode();
		int heightHashcode=strHeight.hashCode();
		int weightHashcode=strWeight.hashCode();
		int finalHashcode=ageHashcode+nameHashcode+heightHashcode+weightHashcode;
		return finalHashcode;
		
		
		//return(strage.hashcode()+name.hashcode()+strheight.hashcode()+strweight.hashCode());
		//return finalHashcode;
	}


}
