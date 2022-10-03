import java.util.Scanner;

class Bank
{


	String username = "admin";
	String pass = "admin";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bank a = new Bank();
		System.out.println("enter username n pass");
		a.username = s.next();
		a.pass = s.next();
		System.out.println("your username n pass is " + a.username + a.pass);
		if(a.username.equals("admin"))
		{
			System.out.println("valid");
		}
		else 
			System.out.println("invalid");
		a.username = s.next();

	if(a.pass.equals("admin"))
		{
			System.out.println("valid");
		}
		else 
			System.out.println("invalid");
		a.pass = s.next();

		
	}
}