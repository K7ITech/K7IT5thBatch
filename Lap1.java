class Lap1{
              int model;
              String company;
              static String windows;
              static int hdmiports;

public static void main(String args[]){
         
           Lap1 p1 = new Lap1();

               p1.model = 143;
               p1.company = "Acer - aspire 7";
               p1.windows = "Twelve";
               p1.hdmiports = 1;
        
           Lap1 p2 = new Lap1();

               p2.model = 142;
               p2.company = "Lenovo idea pad";
               p2.windows = "Eleven";
               p2.hdmiports = 2;
        
  System.out.println("p1 details");
  System.out.println(p1.model);
  System.out.println(p1.company);
  System.out.println(p1.windows);
  System.out.println(p1.hdmiports);

  System.out.println("p2 details");
  System.out.println(p2.model);
  System.out.println(p2.company);
  System.out.println(p2.windows);
  System.out.println(p2.hdmiports);

             p1.windows = "Ten";
             p1.hdmiports = 3;

  System.out.println("p1 and p2 detalis are updated from p1 details");
  System.out.println(p1.windows);
  System.out.println(p2.windows);
  System.out.println(p1.hdmiports);
  System.out.println(p2.hdmiports);
 
           Lap1 p3 = new Lap1();

  System.out.println("p3 details");
  System.out.println(p3.model);
  System.out.println(p3.company);
  System.out.println(p3.windows);
  System.out.println(p3.hdmiports);
}
}