import java.util.Scanner;
 
 class Sum
 {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
         System.out.println("ENTER THE VALUE OF A");

 		int a = sc.nextInt();
 		 System.out.println("ENTER THE VALUE OF B");
 		int b = sc.nextInt();

 		if(a>b)
 		{
 			System.out.println("A IS MAX HERE!!");

 		}
      else 
      	System.out.println(" B IS MAX HERE!!!");
 	}
 }