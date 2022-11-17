import java.util.Scanner;
class MyException extends Exception {
}
 
// A Class that uses above MyException
public class Student {
    // Driver Program
    public static void main(String args[])
    {
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter roll no");
            int a = sc.nextInt();
            System.out.println("enter string");
            String name = sc.next();
            if (a>15&&a<21)
            {
                System.out.println("no exception");
            }
            else 
           
throw new MyException();
         
            
            
        }
        catch (MyException ex) {
            System.out.println("age not proper exception");
            System.out.println(ex.getMessage());
        }
    }
}