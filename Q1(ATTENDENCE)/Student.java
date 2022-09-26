

import java.util.Scanner;

class Student 
{
	

    int held;
    int attended;
    int total;


    void getdata()
    {

      Scanner s = new Scanner(System.in);

     System.out.println(" enter the value of held and attended");
       held = s.nextInt();
       attended = s.nextInt();



    }

    void display()
    {
   	
   	System.out.println("held classes are :" + held);
   	System.out.println("attended classes are :" + attended);

    }

    void calc ()
    {
           total = (attended * 100/held);
           System.out.println("YOUR TOTAL IS :" + total +"%" );

           if ( total >= 75)
           {
           	System.out.println("YOU CAN GIVE EXAM");

           }
           else 
           {
           	System.out.println("YOU can't give exam");
           }

    }


public static void main(String[] args)
 {
	
Student a = new Student();
a.getdata();
a.display();
a.calc();


  }






}