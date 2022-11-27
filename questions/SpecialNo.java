import java.util.Scanner;
class SpecialNo
{
	int n;
	SpecialNo(int n)
	{
		this.n=n;
	}
	int sum()
	{
		int x=n,r,sum=0;
		while(x>0)
		{
			r=x%10;
			sum+=r;
			x/=10;
		}
		return sum;
	}
	int product()
	{
		int x=n,r,p=1;
		while(x>0)
		{
			r=x%10;
			p*=r;
			x/=10;
		}
		return p;
	}
	void result()
	{
		
		int  c = product() +  sum();
		System.out.println("your ans is" + c);
		if(c == n)
		{
			System.out.println("SPECIAL NUMBER");
		}
	   else 
	   {
	   	System.out.println("NOT a special number");
	   }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		SpecialNo obj=new SpecialNo(sc.nextInt());

		obj.result();
	}
}