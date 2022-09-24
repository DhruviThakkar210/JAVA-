class Revers



{
      int remainder ;

	public static void main(String[] args) {
	
       int n = Integer.parseInt(args[0]);
       int rev = 0;
       Revers r = new Revers();

        while(n!=0)
        {
        	r.remainder = n%10;
        	rev = rev*10 + r.remainder;
        	n/=10;
        }

        System.out.println( rev );



	}
}