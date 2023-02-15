	public class VehicleCc{
		   public static void main(String args[]){
		      /// create object for animalType 
			  
			  Vehicle v1 = new Vehicle();  			  
			  
			  v1.model = 15;
			  v1.name = "Rollsroyce";
			  v1.distance = 91.9;
			  v1.time = 19.0;
			  v1.color = "grey";
			 
			  double RollsroyceSpeed  = v1.getSpeed();
			  
			  System.out.println("Rollsroyce details");
			  System.out.println(v1.model);
			  System.out.println(v1.name);
			  System.out.println(v1.distance);
			  System.out.println(v1.time);
			  System.out.println(v1.color);
			  System.out.println(RollsroyceSpeed);
			  
			  Vehicle v2 = new Vehicle();
			  v2.model= 20;
			  v2.name = "Lancer";
			  v2.distance = 80.20;
			  v2.time = 17.0;
			  v2.color = "skyblue";
			  
			  double LancerSpeed  = v2.getSpeed();
			  
			  System.out.println("Lancer details");
			  System.out.println(v2.model);
			  System.out.println(v2.name);
			  System.out.println(v2.distance);
			  System.out.println(v2.time);
			  System.out.println(v2.color);
			  System.out.println(LancerSpeed);
		   }
		}
		
		
		

 

