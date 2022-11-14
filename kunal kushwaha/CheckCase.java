import java.util.Scanner;

class CheckCase
{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);

		if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		else 
			System.out.println("upper case");

	}
}