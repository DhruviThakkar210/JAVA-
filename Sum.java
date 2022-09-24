


class Sum
{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 0;


		while(n>0)
		{
			int m = n % 10;
			sum = sum + m;
			n = n/10;
		}
		System.out.println(  sum);
	}
}