import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int total = ((p*r*t)/100);
		System.out.println("simple interest is :" + total);
	}
}