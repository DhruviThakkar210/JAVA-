import java.util.Scanner;

class Marks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		System.out.println("ENTER THE MARKS");
		int a = sc.	nextInt();
		try 
		{
			if(a<100)
			{
				System.out.println("you entered proper marks");
			}
		}
		catch(ArithmeticException ex)
		{
			System.out.println("exception her is marks are greater than 100" + ex);
		}
		finally
		{
			System.out.println("block final block");
		}

	}
}