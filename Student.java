class Student
		{  
     	    int id;
		    int age;
		    String name;
		    double readingtime;
		    int graspconcepts;
		    String sports;	
			
			public double getGrasping()
			{
			return (readingtime * graspconcepts) / age ;
			}	    
		    public static void main(String args[])
			{ 
			  
			  Student s1 = new Student();  			  
			  
			  s1.id = 49;
			  s1.age = 22;
			  s1.name = "Nani";
			  s1.readingtime = 54.4;
              s1.graspconcepts = 2;
			  s1.sports = "Cricket";
			  
			  double  NaniGrasping = s1.getGrasping();
			  
			  System.out.println("Nani details");
			  System.out.println(s1.id);
			  System.out.println(s1.age);
			  System.out.println(s1.name);
			  System.out.println(s1.readingtime);
			  System.out.println(s1.graspconcepts);
              System.out.println(s1.sports);
			  System.out.println(NaniGrasping);
			  
			  Student s2 = new Student();  			  
			  
			  s2.id = 50;
			  s2.age = 22;
			  s2.name = "Jaswanth";
			  s2.readingtime = 55.3;
              s2.graspconcepts = 3;
			  s2.sports = "volleyball";
			  
			  double  JaswanthGrasping = s2.getGrasping();
			  
			  System.out.println("Jaswanth details");
			  System.out.println(s2.id);
			  System.out.println(s2.age);
			  System.out.println(s2.name);
			  System.out.println(s2.readingtime);
			  System.out.println(s2.graspconcepts);
              System.out.println(s2.sports);
			  System.out.println(JaswanthGrasping);
			  
            }
	    }