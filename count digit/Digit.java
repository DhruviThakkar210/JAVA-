class Digit
{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int count = 0;

		do 
		{
			n/=10;
			++count;
		}
		while(n != 0);

			System.out.println(count);
	}
}