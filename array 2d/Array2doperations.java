import java.util.Scanner;
class Array2DOperations	
{
	int a[][]=new int[2][3];
	void input2dArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2d arraty ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
	}
	void display2dArray()
	{
		System.out.println("display 2d arraty ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		
		Array2DOperations obj=new Array2DOperations();

		obj.input2dArray();
		obj.display2dArray();
		

		
	}
}