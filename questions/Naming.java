import java.util.Scanner;


public class Naming
{
	void result
	{
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (i=1;i<n ;i++ )
	{
		System.out.println(n);
		if(n%3==0 && n%5==0)
	{
		System.out.println(" BIZZ FIZZ");
	}
	else if(n%5==0)
	{
		System.out.println("FIZZZ");
	}
	else if(n%3==0 )
	{
             System.out.println("BIZZ ");
	}
	else 
	{
		System.out.println("CHIZZZ NOT A MULTIPLE OF 3 /5");
	}

 }
}


  public static void main(String[] args) 
{
	Naming c = new Naming();
	c.result();
	
}
}