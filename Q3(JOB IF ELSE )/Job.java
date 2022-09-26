import java.util.Scanner;


class Job
{
	
	int age;
	String gender;


void getdata()
	{
	Scanner s = new Scanner(System.in);
	System.out.println(" enter your gender");
	System.out.println(" enter your age");

      gender = s.next();
	  age = s.nextInt();



	}

	void display()
	{

		System.out.println(" your gender is :" + gender);
		System.out.println(" your age is :" + age);
		

	}
	void calc()
	{
		if(gender.equals("female") )
		{
			 System.out.println("you have to work in urban areas as u are female!");
		}

		else if (gender.equals("male"))
		 {
			if(age>20 && age<40)
			{
				System.out.println("YOU CAN WORK ANYWHERE");
			}
			
		}
		else if ( gender.equals("male")) 
		{
			if(age>40 && age<60)
			{
				System.out.println(" you are male n u can work in urban area");
			}
			
		}


		else 
		{
			System.out.println("ENTER VALID THINGS");
		}


	}


	public static void main(String[] args) 
	{
	     Job a = new Job();
	     a.getdata();
	     a.display();
	     a.calc();
	 }


}