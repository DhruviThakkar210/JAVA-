import java.util.Scanner;
class SpecialNumber
{
	int n;
	SpecialNumber(int n)
	{
		this.n=n;
	}
	int factorial(int x)
	{
		int f=1;
		for (int i=1;i<=x ;i++ ) {
			f*=i;//1*
		}
		return f;
	}
	void specialNumber()
	{
		int r,sum=0,x=n;
		while(x>0)
		{
			r=x%10;//5
			sum=sum+factorial(r);//0+120
			System.out.println(sum);
			x/=10;//14
		}
		if(n==sum)
		{
			System.out.println("special number ");
		}
		else 
		{
			System.out.println("not a special number ");
		}

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		SpecialNumber sp=new SpecialNumber(sc.nextInt());
		sp.specialNumber();
	}
}