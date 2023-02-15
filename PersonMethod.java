class PersonMethod
{
int age;
double height;
double weight; 
double getRunRate()
{
double RunRate =(height*weight)/age;
return RunRate;
}
public static void main(String args[])
{
PersonMethod PM1 = new PersonMethod();
PM1.age=25;
PM1.height=5.5;
PM1.weight=65;
double PM1RunRate=PM1.getRunRate();
System.out.println("RunRate of PM1:"+ PM1RunRate);
}
}
