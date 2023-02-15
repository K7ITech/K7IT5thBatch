public class PersonManager{
		   public static void main(String args[]){
		      /// create object for person class 
			  
			  Person p1 = new Person();  			  
			  
			  p1.age = 24;
			  p1.name = "mahesh";
			  p1.height = 5.9;
			  p1.weight = 55.0;
			  p1.color = "brown";
			  
			  double maheshRunRate  = p1.getRunRate();
			  
			  System.out.println("mahesh details");
			  System.out.println(p1.name);
			  System.out.println(p1.age);
			  System.out.println(p1.height);
			  System.out.println(p1.weight);
			  System.out.println(p1.color);
			  System.out.println(maheshRunRate);
			  
			  Person p2 = new Person();
			  p2.age = 24;
			  p2.name = "Shesi";
			  p2.height = 5.5;
			  p2.weight = 66.0;
			  p2.color = "gold";
			  
			  double shesiRunRate  = p2.getRunRate();
			  
			  System.out.println("Shesi details");
			  System.out.println(p2.name);
			  System.out.println(p2.age);
			  System.out.println(p2.height);
			  System.out.println(p2.weight);
			  System.out.println(p2.color);
			  System.out.println(shesiRunRate);
		   }
		}
		