import java.util.Scanner;
class Palindrome
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
	int rev = 0;
	while(n!=0)
	{
		int rem = n % 10;
		 rev = (rev*10) + rem;
		 n = n/10;
	}

	if ( temp ==  n)
	{
		System.out.println("palindrome");
	}
	else 
		System.out.println("not a palindrome");
}









}