class Bank 
{
	int balance;
	int acc;
	String name;
	int mno;
   public static void main(String[] args)
    {
   	  Bank b = new Bank();
   	 


   	  b.balance = Integer.parseInt(args[0]);
   	  b.acc = Integer.parseInt(args[1]);
   	  b.name = (args[2]);
   	  b.mno = Integer.parseInt(args[3]);



   	  System.out.println("BALANCE :"+ b.balance);
   	 System.out.println("ACCOUNT NO. IS:" +b.acc);
   	 System.out.println("NAME IS "+ b.name);
   	 System.out.println("MNO IS :"+ b.mno);





   }
}