import java.util.Scanner;


public class Multiple
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
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