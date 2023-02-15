
/*constructor



class A{

A(){
System.out.println ("no arg constructor ");
}
A(int i){
this("sasi");
System.out.println(" int constructor with value :"+i);
}
A(String s){
this();
System.out.println("String constructor with valu str:"+s);
}

A(int i,String s){
System.out.println(" int and String constructor:"+s+" "+i);
}

public static void main (String args []){

A p = new A(1);
A p3 = new A(10,"kiran");
}
}


no arg constructor
String constructor with valu str:sasi
 int constructor with value :1
 int and String constructor:kiran 10

======================================================================================================================

class Sasi{
int age ;
String name ;
double height ;
double weight ;


Sasi(){
System.out.println ("no arg constructor ");
}
Sasi(int age , double k){
System.out.println(" int  and double constructor with value :"+i+" "+k);
}
Sasi(String s, int l){
this();
System.out.println("String  and int constructor with valu str:"+s+" "+l);
}

Sasi(int i,String s,double j){
System.out.println(" int and String  and double constructor:"+s+" "+i+" "+j);
}

public static void main (String args []){

Sasi p = new Sasi(1,22.0);
Sasi p3 = new Sasi("kiran",55);
Sasi p4 = new Sasi(898,"king",29.22);
Sasi p9 = new Sasi("car",99);

}
}

int  and double constructor with value :1 22.0
no arg constructor
String  and int constructor with valu str:kiran 55
 int and String  and double constructor:king 898 29.22
no arg constructor
String  and int constructor with valu str:car 99
																						
===============================================================================================================
class Sasi{
int age ;
String name ;
double weight ;
double height ;
Sasi (int a,String n,double w,double h)
{
age  = a;
name = n;
weight = w;
height = h;
System.out.println("int age:"+age+",String name:"+name+",double height:"+height+",double weight:"+weight);
}
public static void main (String args[]){
Sasi p1 = new Sasi(22,"sasi",100,5.9);
}
}

=================================================================================

class Person{
int age ;
String name;
double weight;
float height ;

public static void main(String args[]){
Person p1 = new Person();
p1.age = 22 ;
p1.name = "sasi"; 
p1.weight = 79.00 ;
p1.height = 5.9f;

Person p2 = new Person();
p2.age = 29 ;
p2.name = "kiran"; 
p2.weight = 85.00 ;
p2.height = 5.40f ;

Person p3 = new Person ();
p3.age    =44;
p3.name ="mahi";
p3.weight =88.6 ;
p3.height =6.0f ;

System.out.println("sasi details ");
System.out.println(p1.age);
System.out.println(p1.name);
System.out.println(p1.height);

System.out.println("kiran details ");
System.out.println(p1.age);
System.out.println(p1.name);
System.out.println(p1.height);

System.out.println("mahi details ");
System.out.println(p3.age);
System.out.println(p3.name);
System.out.println(p3.height);
System.out.println(p3.weight);

}
}

==============================================

*/
class Sasi{
int age ;
String name ;
double height ;
double weight ;


Sasi(){
System.out.println ("no arg constructor ");
}
Sasi(int age , double height)
{
this.age=age ;
this.height=height;

System.out.println(" int  and double constructor with value :"+age+" "+height);
}
Sasi(String s, int l){
this();
System.out.println("String  and int constructor with valu str:"+s+" "+l);
}

Sasi(int i,String s,double j){
System.out.println(" int and String  and double constructor:"+s+" "+i+" "+j);
}

public static void main (String args []){

Sasi p = new Sasi(1,22.0);
Sasi p3 = new Sasi("kiran",55);
Sasi p4 = new Sasi(898,"king",29.22);
Sasi p9 = new Sasi("car",99);

}
}

