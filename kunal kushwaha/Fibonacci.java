import java.util.Scanner;


class Fibonacci
{




public static void main(String[] args) {
	int a = 0;
	int b = 1;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	for(int i=0;i<n;i++)
	{

		int sum = a+b;
       System.out.println("series is " + sum);
        a = b;
        b = sum;


	}
}












}