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