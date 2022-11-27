import java.util.Scanner;

public class Special 
{

        int multi = 1;
        int sum = 0;

	void sum(int n)
	{ 
        int r;
		for (;n>0;n=n/10)
		 {	 
			r = n%10;
		   	sum = sum + r;
		}
	}
	void multiply(int n)
	{
		int r;
		while(n>0)
		{
			r = n%10;
		    multi = r*multi;
		    n=n/10;
		}

	}

	void result(int n)
	{
		
		int  c = multi +  sum;
		System.out.println("your ans is" + c);
		if(c == n)
		{
			System.out.println("SPECIAL NUMBER");
		}
	   else 
	   {
	   	System.out.println("NOT a special number");
	   }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Special b =  new Special();
         
        int x= sc.nextInt();
		
		b.multiply(x);
		b.sum(x);
		b.result(x);
	}
} 