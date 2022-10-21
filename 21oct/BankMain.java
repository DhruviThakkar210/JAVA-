import java.util.Scanner;
class Bank 
{
	//instance variable 
	int acno;
	String name,mno;
	long balance ;
	static int n;//total no. of customer/records 

	//constructor 
	Bank(String name,String mno,int acno,long balance)
	{
		this.name=name;
		this.mno=mno;
		this.acno=acno;
		this.balance=balance;

	}
	//instance method 
	void display()
	{
		System.out.println(acno+" "+name+" "+mno+" "+balance);
		System.out.println("************************");
	}
	void withdrawal(long wamt)
	{
		if(wamt>balance)
		{
			System.out.println("u have insufficinet balance ");
		}
		else 
		{
			balance=balance-wamt;
			System.out.println("Main balance after withdrwal "+balance);
		}

	}
	void deposit(long damt)
	{
		balance=balance+damt;
		System.out.println("Main balance after deposit "+balance);	
	}


}
class BankMain
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//create an array 
		Bank b[]=new Bank[10];
		while(true)
		{
			System.out.println("1.create\n2.display\n3.withdrawal\n4.deposit\n5.searching\n6.exit");
			System.out.println("enter ypour choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("enter the total no.of records ");
						Bank.n=sc.nextInt();
						for (int i=0;i<Bank.n ;i++ ) {
							System.out.println("enter name,mno,acno & balance");
							String nm=sc.next();
							String mb=sc.next();
							int ac=sc.nextInt();
							long bal=sc.nextLong();
							//to allocate the memory 
							b[i]=new Bank(nm,mb,ac,bal);
						}
						break;
				case 2:for (int i=0;i<Bank.n ;i++ ) {
						b[i].display();
						}
						break;
				case 3:System.out.println("enter acno");
						int m=sc.nextInt();
						boolean flag=false;
						for (int i=0;i<Bank.n ;i++ ) {
							if(b[i].acno==m)
							{
								flag=true;
								System.out.println("record found ");
								System.out.println("enter withdrwal amount ");
								long w = sc.nextLong();
								b[i].withdrawal(w);
								break;
							}
							
						}
						if(flag==false)
						{
							System.out.println("record not found ");
						}
						break;
				case 4:System.out.println("enter acno");
						 m=sc.nextInt();
						 flag=false;
						for (int i=0;i<Bank.n ;i++ ) {
							if(b[i].acno==m)
							{
								flag=true;
								System.out.println("record found ");
								System.out.println("enter deposit amount ");
								long w = sc.nextLong();
								b[i].deposit(w);
								break;
							}
							
						}
						if(flag==false)
						{
							System.out.println("record not found ");
						}
						break;

				case 6:System.exit(0);
						break;
				default:System.out.println("wrong choice ");
						break;
					
				}
			

		}
	}
}