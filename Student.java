class Student{
int SNo;
String Name;
String College;
double GrossMarks;
double TotalMarks;

 
                         public double getPercentage()
                         {
                          double Percentage =(GrossMarks/TotalMarks)*100;
                          return Percentage;
                          }

		      public static void main(String args[]){
                      
			  
			  Student S1 = new Student();
			  S1.SNo = 1;
			  S1.Name = "Giri";
			  S1.College = "GEC";
			  S1.GrossMarks = 750;
			  S1.TotalMarks = 1000;
                          double GiriPercentage  = S1.getPercentage();		  
			  
                          System.out.println("giri details");
			  System.out.println(S1.SNo);
			  System.out.println(S1.Name);
			  System.out.println(S1.College);
			  System.out.println(S1.GrossMarks);
			  System.out.println(S1.TotalMarks);
                          System.out.println(GiriPercentage);
			
			  
			  
			 }
		}