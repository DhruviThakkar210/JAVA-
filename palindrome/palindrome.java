class palindrome
{
	int r;

public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	int sum = 0;
	palindrome p = new palindrome();

int temp = n;
	while(n>0)    

{    
p.r=n%10;    
sum=(sum*10)+p.r;    
n=n/10;    
}    

if(temp == sum)
	System.out.println("palindrome");
else 
	System.out.println("not palindrome");



}




}