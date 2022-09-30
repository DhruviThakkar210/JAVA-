
/* AREA OF TRIANGLE*/

import java.util.Scanner;





class Triangle
{
     Double a;
     Double b;
     Double c;


	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the value of a & b");
		 a = s.nextDouble();
		 b = s.nextDouble();
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	void cal()
	{
	 c =	( (0.5) * (a * b));
	 System.out.println(" your area of triangle is:"+ c);
	}
	public static void main(String[] args) {
		
          Triangle a = new Triangle();
          a.getdata();
          a.display();
          a.cal();


		}
}