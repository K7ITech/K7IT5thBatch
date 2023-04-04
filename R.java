clas class R{
	int cash;
	String name;
	double height;
	char gender;
      
	  R(int cash){
		  this(44.56);
	   System.out.println("int constructor : "+cash);
	   } 
	   
	   R(int i,String s,double h){
		cash = i;                 // R(int cash,String name,double height){  this.cash = cash;   this.name = name;  this.height = height;   }
         name = s;
         height = h;
		 
	   System.out.println("int - String - double constructor");
	   }
	   
	   R(String name,int cash){   
	   System.out.println("String - int constructor");
	   }
	   
	   R(double weight){   
	   System.out.println("double constructor: "+weight);
	   }
	   
	   public static void main(String args[])
	   {
	   R r2 = new R(23);
	   
	   R r3 = new R(34,"nani",22.23);
	   System.out.println(r3.cash);
	   System.out.println(r3.name);
	   System.out.println(r3.height);
	   
	   R r4 = new R("nani",22); 
	   r4.name = "nani";
	   r4.cash = 22; 
	   System.out.println(r4.name);
	   System.out.println(r4.cash);
	   }
}