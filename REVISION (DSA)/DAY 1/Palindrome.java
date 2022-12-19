import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args)
	{ 
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0;i<n ;i++ ) 
		{
		  int rem = n%10;
		  rev = rev*10 + rem;
		  n = n/10;
		  System.out.println(rev);

		}
	}
}