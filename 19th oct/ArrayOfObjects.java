import java.util.Scanner;
class Emp
{
	//instance variable 
	int eid;//4
	String name ;
    int acc;
    int bal;
	//
	//parameterised constructor 
	Emp(int id,String n,int acco,int balance)
	{
		eid=id;
		name=n;
		acc = acco;
		bal = balance;

	}
	//instance method or non-static method 
	void showDetails()
	{
		System.out.println(eid+" "+name+" " + acc +" " +bal +"");
	}	
}
class ArrayOfObjects
{
	public static void main(String[] args) {
		//Scanner object 
		Scanner sc=new Scanner(System.in);
		//create an array 
		Emp e[]=new Emp[5];
		System.out.println("enter the total no. of records ");
		int n=sc.nextInt();

		for (int i=0;i<n ;i++ ) {
			System.out.println("enter name ,id,acc,balance ");
			String s=sc.next();
			int x=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			e[i]=new Emp(x,s,a,b);
		}

		
		for (int i=0;i<n;i++ ) {
			
			e[i].showDetails();
			System.out.println("************************");
		}
			

	}
}