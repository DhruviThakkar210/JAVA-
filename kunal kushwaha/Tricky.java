import java.util.Scanner;

class Tricky
{

public static void main(String[] args) 
   {
   	      int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO. U WANT");
		int n = sc.nextInt();
		for(int i =0 ;i<n;i++)
		{
			int a = sc.nextInt();
			 sum = sum + a;
			
		
       }

System.out.println(sum);


	}
}