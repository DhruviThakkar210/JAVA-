/*instance - acnoi,name,mno,balance 


	methods 

		- createAccoount()
		- displayAccount()
		- withdrwal(int wamt)
		- deposit(int damt)*/




import java.util.Scanner;

     
class Bank 
{

	int acc;
      String name;
      int mno;
      int balance;
	void createAccount()
	{
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE ACC, NAME,MNO,BALANCE");
        acc = s.nextInt();
        name = s.next();
        mno = s.nextInt();
        balance = s.nextInt();

	}
 
 void displayAccount()
	{
		System.out.println("acc is" + acc + "name is " + name+ "mno is" + mno+ "balance is" + balance);
	}

	int withdrawal(int wmoney)
	{
		balance = balance - wmoney;
		return balance;
	}
	int deposit(int dmoney)
	{
		balance = balance + dmoney;
		return balance;
	}
 
 public static void main(String[] args)
 {
 	
    Bank a = new Bank();
    a.createAccount();
    a.displayAccount();
    System.out.println("MONEY withdrawal from balance ="+ ""+a.withdrawal(1500));
    System.out.println("MONEY deposited in a balance = " +"" +a.deposit(5000));






 }



}