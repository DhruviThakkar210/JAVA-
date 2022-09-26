import java.util.Scanner;


class Shop 
{
	

	int unit = 100 ;
     int quantity;
     int total;

	void getdata()
	{
	Scanner s = new Scanner(System.in);
	System.out.println(" enter the units you bought");

	  quantity = s.nextInt();

	}
	void display()
	{
		System.out.println(" YOU BOUGHT " + quantity + "units");
	}

	void calc()
	{

            total = unit * quantity;

            if (total>1000)
            {
            	total = (total*10)/100;
            System.out.println("yeah you got discount" + total);
            }
           else 
           {
           	System.out.println("sorry  you won't get discount" + total);
           }
	}
	public static void main(String[] args) 
	{
	     Shop a = new Shop();
	     a.getdata();
	     a.display();
	     a.calc();	
	}
}