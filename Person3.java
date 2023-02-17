class person3{
int age;
double height;
double weight;
double getRunRate(){
double runRate=(height*weight)/age;
return runRate;
}
}
class Person3Manager{
public static void main(String args[]){
person3 lucky=new person3();
lucky.age=22;
lucky.height=5.4;
lucky.weight=26.2;
double luckyrunRate=lucky.getRunRate();
System.out.println(luckyrunRate);
}
}
