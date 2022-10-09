import java.util.Scanner;


class Maxi
{
	

 Double a;
 Double b; 
 Double c;


	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the value of a");
		 a = s.nextDouble();
		 System.out.println(" enter the value of b");
	     b = s.nextDouble();
	     System.out.println(" enter the value of c");
	     c = s.nextDouble();

		
	}

	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	void cal()
	{
	 if(a>b)
	 	{
	 		if(a>c)
	 		{
	 			System.out.println("max no is " + a);
	 		}
	 		else 
	 		{
	 			System.out.println("max no is" + c);
	 		}
	 	}
	 	else 
	 	{
	 		if(b>c)
	 		{
	 			System.out.println("max is " + b);

	 		}
	 		else 
	 		{
	 			System.out.println("max is "  + c);
	 		}
	 	}
	 } 
	
	public static void main(String[] args)
	
	{
		
          Maxi a = new Maxi();
          a.getdata();
          a.display();
          a.cal();


		}


}



