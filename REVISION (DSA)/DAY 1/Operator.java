import java.util.Scanner;
class Operator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		  char o = sc.next().charAt(0);

		if(o == '+')
		{
			int c = a+b;
			System.out.println(c);
		}
		if(o == '-')
		{
			int c = a-b;
			System.out.println(c);
		}
		if(o == '*')
		{
			int c = a*b;
			System.out.println(c);
		}
	}
}