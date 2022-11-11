import java.util.Scanner;

class Simple
{

public static void main(String[] args) 

{
  
Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE NUMBER OF YEARS");
int n = sc.nextInt();
System.out.println("ENTER THE RATE");
int r = sc.nextInt();
System.out.println("ENTER THE PRINCIPAL AMOUNT");
int p = sc.nextInt();


int total = (p*r*n)/100;
System.out.println(" simple interest calculated as per details is :" + total);





}


}