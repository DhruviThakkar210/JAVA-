class Bank
{
	int acc;
  static String branch = "vadodara";
	int mno;
	int balance; 
	String name;

 Bank(int acc ,int mno,int balance,String name)
    {
       this.acc = acc;
       this.mno = mno;
       this.balance = balance;
       this.name = name;  
    }
     void display()
     {
     	System.out.println(acc+""+branch+"" + mno +""+balance+""+name);
     	System.out.println("USE OF STATIC IS THAT IT CAN BE ACCESSED ANYWHERE INSIDE THE BLOCK AND OUTSIDE THE BLOCK WITH .CLASS !");
     }
     

}

class  BankMain
{
	public static void main(String[] args) {
		Bank a = new Bank(111,1234567890,1200,dhruvi);
		a.Bank();
		a.display(); 
	}
}