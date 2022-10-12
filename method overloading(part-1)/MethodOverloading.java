class MethodOverloading
{
	void addition(int a)
	{
		int add=a+a;
		System.out.println("addition 1 para "+add);
	}
	void addition(int a,int b)
	{
		int add=a+b;
		System.out.println("addition int para "+add);

	}
	void addition(double a,double b)
	{
		double add=a+b;
		System.out.println("addition double para "+add);

	}
	
	void addition(int a,int b,int c)
	{
		int add=a+b+c;
		System.out.println("addition 3 para "+add);
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.addition(34);
		obj.addition(12,4);
		obj.addition(1,2,3);
		obj.addition(3.4,5.5);
	}
}