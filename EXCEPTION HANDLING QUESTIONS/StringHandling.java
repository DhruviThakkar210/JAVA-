import java.util.Scanner;
class StringHandling 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
          String a = sc.next();
          String b = sc.next();
          if(a==b)
          {
          	System.out.println("both the strings are same!!");
          }
		}
		catch(Exception ex)
		{
			System.out.println("exception here is" + ex);
		}
		finally
		{
			System.out.println("this is final block");
		}
	}
}