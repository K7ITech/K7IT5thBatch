<<<<<<< HEAD
class Calculator
{
int add(int i,int j)
{
return i+j;
}
int add (int i,int j,int k)
{
return i+j+k;
}
int add (int i,int j,int k,int l)
{
return i+j+k+l;
}
}
class CalculatorManager
{
public static void main(String args[])
{
Calculator c1=new Calculator();
c1.add(10,20);
c1.add(10,20,30);
c1.add(10,20,30,40);
}
}
=======
class Calculator
{
int add(int i,int j)
{
return i+j;
}
int add (int i,int j,int k)
{
return i+j+k;
}
int add (int i,int j,int k,int l)
{
return i+j+k+l;
}
}
//@Demo
class CalculatorManager
{
public static void main(String args[])
{
Calculator c1=new Calculator();
c1.add(10,20);
c1.add(10,20,30);
c1.add(10,20,30,40);
}
}
>>>>>>> aed94d7665767756561cf553475f3f6a49910de2
