import java.util.Scanner;

class Occurence
{




public static void main(String[] args) 
{
	int count = 0;
  int n = 22345;
  while(n>0)
  {
  	int r = n%10;
   if (r == 2)
   {
   	count++;
   }
   n/=10;

  }	
  System.out.println(count);
}





}