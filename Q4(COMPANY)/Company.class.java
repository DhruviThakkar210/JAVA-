import java.util.Scanner;


class Company 
{
	int salary;
	int experience;
	int total;

      void getdata()
      {
         Scanner s = new Scanner(System.in);
         System.out.println("ENTER YOUR SALARY N EXPERIENCE");
         salary = s.nextInt();
         experience = s.nextInt();
      }

      void display()
      {
      	System.out.println("YOUR SALARY IS"+ salary);
      	System.out.println("YOUR SALARY IS"+experience);
      }

      void calc()
      {
      	if(experience>5)
      	{
      		total = salary +(salary * 5 )/100;
      		System.out.println("YOUR TOTAL SALARY IS" + total);
      	}
      	else 
      	{
      		total = salary;
      		System.out.println("SORRY YOU WON'T GET BONUS AND YOUR TOTAL IS"+ total);
      	}
      }

      	public static void main(String[] args) {
      		Company a = new Company();
      		a.getdata();
      		a.display();
      		a.calc();
      	}
      }




