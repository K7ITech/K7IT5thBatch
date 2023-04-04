/*
=====================================================================================================================================
(1).to print a simple stmt & verifying wt kind of errors will accour at the main method missing stmt is modified

class Home{
	
public static void main(String args[]){
System.out.println("Going to home budddy");
}
}										
                                                     O/P : Going to home buddy
											 
1.1
class Home{
	
static public void main(String args[]){
System.out.println("Going to home budddy");
}
} 
                                                     O/P:Going to home budddy
											 
1.2
class Home{
	
void main(String args[]){
System.out.println("Going to home budddy");
}
}

                                                     Error while runtime 

                                                          C:\Lab\5th_batch\dev\classes>java Home
                                                          Error: Main method not found in class Home, please define the main method as:
                                                          public static void main(String[] args)
                                                          or a JavaFX application class must extend javafx.application.Application

1.3
class Home{
	
main(String args[]){
System.out.println("Going to home budddy");
}
}
                                                     Error
													 
											         Home.java:114: error: invalid method declaration; return type required
                                                     main(String args[]){
                                                     ^
                                                     1 error
1.4
class Home{
	
void(String args[]){
System.out.println("Going to home budddy");
}
}												 	 Error										 
													 Home.java:121: error: <identifier> expected
                                                     void(String args[]){
                                                         ^
                                                      1 error
interface Home
{
public static void main(String[] nani)
{
System.out.println("Going to home budddy");
}
} 

class Sole
{
public static void main(String[] nani)
{
System.out.println("home budddy");
}
}
                                        we can use both class and interface.....................
=====================================================================================================================================
(2).to print details of a person

class Home{
	
	double expence;
	String name;
	double currentbill;
	
public static void main(String args[]){
	
	Home h1 = new Home();
	h1.expence = 5000.45;
	h1.name = "Anuradha";
	h1.currentbill = 345.78;
	
   System.out.println("Anuradha Details");
   System.out.println(h1.expence);
   System.out.println(h1.name);
   System.out.println(h1.currentbill);
}
}
                                                     O/P:
                                                         Anuradha Details
                                                         5000.45
                                                         Anuradha
                                                         345.78
=======================================================================================================================================
(3).To print the salray details of a person and average of the total bonus 

 class Bank{
	 String name;
	 long accountno;
	 double amount;
	 
	 double getTotalbonus()
	 {
		 return (2*amount);
	 }
  
public static void main(String args[]){
	
	Bank b = new Bank();
	
	b.name = "Nani";
	b.accountno = 123459876;
	b.amount = 100000;
	
	double NaniTotalbonus = b.getTotalbonus();
	
   System.out.println(b.name);
   System.out.println(b.accountno);
   System.out.println(b.amount);
   
    System.out.println(NaniTotalbonus);
	
	double Average = (NaniTotalbonus*10)/2;
	System.out.println(Average);
}
} 
	 
	                                           O/P : Nani
                                                     123459876
                                                     100000.0
                                                     200000.0
                                                     1000000.0

=======================================================================================================================================
(4). No-arg Constructor
 class A{
	  A(){
		  System.out.println("no arg constructor");
	  }
	 public static void main(String args[])
	 {
	 A a = new A();
	 }
	 }
	                                            O/P:
												     no arg constructor
									
	public class Sasi{
	int a;
	int b;
	 public Sasi()
	{
		a = 5;		
	}
	public Sasi(int n)
	{
		b = 1;		
	}
	
	public static void main(String args[]){
		Sasi s = new Sasi();
        Sasi s1 = new Sasi(12);
		System.out.println(s.a);
		System.out.println(s1.b);
	}
}
                                                O/P:5
												    1
=====================================================================================================================================
(5). program based on constructor ,constructor overloading & Parameter constructor 
class A
{
	  A(){
		  System.out.println("no arg constructor");
	  }
	  
	  A(int money){
		  System.out.println("int type constructor :"+money);
	  }
	  
	  A(int money,String name){
		  System.out.println("int-String type constructor:"+money+" "+name);
	  }
	  
	  A(String name,int money){
	  System.out.println("String-int type constructor:"+name+" "+money);
	  }
	  
	  A(String name,int money,double waterbill){
	  System.out.println("String-int-double type constructor:"+name+" "+money+" "+waterbill);
	  }
	  
	  A(String name,double waterbill,int money,long salary){
	  System.out.println("String name:"+name+",double waterbill:"+waterbill+",int money:"+money+",long salary:"+salary);
	  }
	  
	 public static void main(String args[])
	 {
		 
	 A a = new A();
	 A a1 = new A(23);
	 A a2 = new A(22,"Nani");
	 A a3 = new A("Anuradha",47);
	 A a4 = new A("Bindu",20,123.45);
	 A a5 = new A("Sriramulu",199.67,55,40000); 
	 }
	 }	
											 O/P:
												no arg constructor
												int type constructor :23
												int-String type constructor:22 Nani
												String-int type constructor:Anuradha 47
												String-int-double type constructor:Bindu 20 123.45
												String name:Sriramulu,double waterbill:199.67,int money:55,long salary:40000	
=========================================================================================================================================
(6).Constructor Chaining

class A{
        A()
		{
			this("Nani");
			System.out.println("no arg constructor");
		}
		A(String s)
		{ 
		     this(10);
			System.out.println("String constructor:"+s);
		}
		A(int n)
		{
			System.out.println("int constructor :"+n);
		}
		
public static void main(String args[])
	 {
		 A a = new A();
	 }
}		

											O/P : 
												int constructor :10
												String constructor:Nani
												no arg constructor
=========================================================================================================================================
(7)to perform a program for constructor ,constructor overloading,parameter constructor & Constructor Chaining

class A{
	    int cash;
		String name;
		double speed;
		
		A(String name)
		{
			this(20);
			System.out.println("String type constructor:"+name);
		}
		
		A(int cash)
		{
			this(22.345);
			System.out.println("int type constructor:"+cash);
		}
		
		A(double weight)
		{
		System.out.println("double type constructor:"+weight);	
		}
		
		A(String s,int i,double d)
		{
			name = s;                                          
			cash = i;
			speed = d;
			System.out.println("String-int-double type constructor");
		}
		
        A(int cash,String name)
		{
		System.out.println("int-String type constructor");	
		}
		public static void main(String args[])
		{
			A a2 = new A("raju");
			A a = new A("Teja",22,50);
			System.out.println(a.name);
			System.out.println(a.cash);
			System.out.println(a.speed);
			
			A a1 = new A(23,"Anuradha");
			a1.cash = 23;
			a1.name  = "Anuradha";
			System.out.println(a1.cash);
			System.out.println(a1.name);
		}
		}
		
												O/P:
													double type constructor:22.345
													int type constructor:20
													String type constructor:raju
													String-int-double type constructor
													Teja
													22
													50.0
													int-String type constructor
													23
													Anuradha
======================================================================================================================================

class A
{
	  A(){
		  System.out.println("no arg constructor");
	  }
	  A(int money){
		  System.out.println("int type constructor :"+money);
	  }
	  
	  A(int money,String name){
		  System.out.println("int-String type constructor:"+money+" "+name);
	  }
	  
	  A(String name,int money){
	  System.out.println("String-int type constructor:"+name+" "+money);
	  }
	  
	  A(String name,int money,double waterbill){
	  System.out.println("String-int-double type constructor:"+name+" "+money+" "+waterbill);
	  }
	  
	  A(String name,double waterbill,int money,long salary){
	  System.out.println("String-double-int-long:"+name+" "+waterbill+" "+money+" "+salary);
	  }
	  
	 public static void main(String args[])
	 {
		 
	 A a = new A();
	 A a1 = new A(23);
	 A a2 = new A(22,"Nani");
	 A a3 = new A("Anuradha",47);
	 A a4 = new A("Bindu",20,123.45);
	 A a5 = new A("Sriramulu",199.67,55,40000); 
	 }
	 }
	                                                     O/P : no arg constructor
                                                               int type constructor :23
                                                               int-String type constructor:22 Nani
                                                               String-int type constructor:Anuradha 47
                                                               String-int-double type constructor:Bindu 20 123.45
                                                               String-double-int-long:Sriramulu 199.67 55 40000
															   
	================================================================================================================================== 
**(Methods)**

inside static methods we cant access non-static / instance attributes directly...............

class P{
static int i = 10;
int j = 20;

static void m1()
{
	System.out.println(i);
	System.out.println(j);
}
}
C:\Lab\5th_batch\dev\src>javac -d ../classes P.java
P.java:8: error: non-static variable j cannot be referenced from a static context
        System.out.println(j);
                           ^
1 error

inside static methods we cant access non-static / instance method directly...............
class A1
{
void m1()
{
System.out.println("non static");
}
static void m2()
{
System.out.println("static");
} 
static void m3(){
	m2();
	m1();
}
}
C:\Lab\5th_batch\dev\src>javac -d ../classes O.java
O.java:13: error: non-static method m1() cannot be referenced from a static context
        m1();
        ^
		
class Sasi{
	 static int m1()
	{
	return 11;		
	}
    long m2()
	{
		return 122;
	}
	static void m3()
	{
		Sasi s = new Sasi();
		Sasi.m1();
		s.m2();	
	}
}

..............................................................................................................................
inside non static methods we can access both non-static & static attributes directly with in the same class
 
class P{
static int i = 10;
int j = 20;

 void m1()
{
	System.out.println(i);  //cs **but in run time it will get and execution time error as main method not found.
	System.out.println(j);  //cs
}
}
.....................................
inside non static methods we can access both non-static & static method directly with in the same class

class A1
{
void m1()
{
System.out.println("non static");
}
static void m2()
{
System.out.println("static");
}
void m3(){
	m2();
	m1();
}
}
................................................................................................................
class Sasi{
int m1()
{
  return  19; .......//cs
}
double i = m1();
}
  
 ..................................................
class Sasi{
int m1()
{
	return  10.11;
}
double i = m1();
}

Sasi.java:4: error: incompatible types: possible lossy conversion from double to int
        return  10.11;
....................................................
class Sasi{
double m1()
{
  return  19.22;
}
int i = m1();
}
Sasi.java:6: error: incompatible types: possible lossy conversion from double to int
int i = m1();
          ^
1 error
....................................................
class Sasi{
int m1()
{
  return  19; .....//cs
}
double i = m1();
}

.......................................	............	
class Sasi{
void m1()
{
	return;
}
double d = m1();
}

Sasi.java:6: error: incompatible types: void cannot be converted to double
double d = m1();
             ^
1 error
.....................................................
class Sasi{
void m1()
{
	return 10;
}
}

Sasi.java:4: error: incompatible types: unexpected return value
        return 10;
               ^
1 error
......................................................
class Sasi{
void m1()
{
	return 10;
}
int k = m1();
}

Sasi.java:4: error: incompatible types: unexpected return value
        return 10;
               ^
Sasi.java:6: error: incompatible types: void cannot be converted to int
int k = m1();
          ^
2 errors
.......................................................
class Sasi{
String m1()
{
	return "nani";
}
double k = m1();
}

Sasi.java:6: error: incompatible types: String cannot be converted to double
double k = m1();
             ^
1 error
......................................................
class Sasi{
String m1()
{
	return 12.32;
}
double k = m1();
}

Sasi.java:4: error: incompatible types: double cannot be converted to String
        return 12.32;
               ^
Sasi.java:6: error: incompatible types: String cannot be converted to double
double k = m1();
             ^
2 errors
.......................................................
class Sasi{
double m1()
{
	return "nani";
}
String k = m1();
}

Sasi.java:4: error: incompatible types: String cannot be converted to double
        return "nani";
               ^
Sasi.java:6: error: incompatible types: double cannot be converted to String
String k = m1();
             ^
2 errors
.........................................................
*/
class A 
{
	int i = 20;
}
class B extends A
{
	
}	
         A a1 = new A();
	System.out.println(a1.i);
	
	       
