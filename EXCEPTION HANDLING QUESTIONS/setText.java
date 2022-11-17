import java.util.Scanner;
class MyException extends Exception {
}
 
// A Class that uses above MyException
public class setText {
    // Driver Program
    public static void main(String args[])
    {
        try {

            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            
            throw new MyException();
        }
        catch (MyException ex) {
            System.out.println("Name not proper exception");
            System.out.println(ex.getMessage());
        }
    }
}