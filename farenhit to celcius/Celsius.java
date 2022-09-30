import java.util.Scanner;


class Celsius 
{
	

 Double f;
    
     Double c;


	void getdata()
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the value of c");
		 c = s.nextDouble();
		
	}

	void display()
	{
		System.out.println(c);

	}

	void cal()
	{
	 f =( (1.8 * c) + 32);
	 System.out.println(" ANSWER  is:"+ f);
	}
	public static void main(String[] args){
		
          Celsius a = new Celsius();
          a.getdata();
          a.display();
          a.cal();


		}
}





