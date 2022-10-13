class Mo
{
	void area(double r)
	{
    
    double c = (3.14*r*r);
    System.out.println("your area of circle is " + c);


	}

	void area(double a , double b)
	{
    
    double c = (a*b);
    System.out.println("your area of reactangle is " + c);


	}
	void area(int a)
	{
    
    double c = (a*a);
    System.out.println("your area of square " + c);


	}

	void area(int a , int b)
	{
    
    double c = 0.5*(a*b);
    System.out.println("your area of triangle is " + c);


	}


	public static void main(String[] args) 
	{
		Mo a = new Mo();
		a.area(3.0);
		a.area(1.0,2.0);
		a.area(1);
		a.area(1,2);

	}
}