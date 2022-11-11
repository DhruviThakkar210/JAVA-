import java.util.Scanner;

class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int no = sc.nextInt();
System.out.println("ENTERED NO. IS " + no);
if(no%2==0)
{
	System.out.println("ENTERED NO IS EVEN ");
}
else 
	System.out.println("ENTERED NO IS ODD");



	
}



}