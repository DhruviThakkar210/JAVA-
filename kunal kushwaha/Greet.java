import java.util.Scanner;



class Greet
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("PLEASE ENTER THE NAME");
	String name = sc.next();
	System.out.println("Greeting of the day "  + name + "!");

}
}