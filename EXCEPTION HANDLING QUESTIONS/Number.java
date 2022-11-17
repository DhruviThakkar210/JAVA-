import java.util.Scanner;
class MyException1 extends Exception {
    MyException1(String s)
    {
        super(s);
    }
}
class MyException2 extends Exception {
    MyException2(String s)
    {
        super(s);
    }
}
class MyException3 extends Exception {
     MyException3(String s)
    {
        super(s);
    }
}

 
// A Class that uses above MyException
public class Number {
    static void checkNumber()throws MyException1,MyException2,MyException3
    {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a>0 && a<5)
            {
                throw new MyException1("smaller no exception");
            }
            else if(a>5 && a<10)
            {
                 throw new MyException2("perfect number exception");
            }
           else if(a>10)
           {
             throw new MyException3("greater number exception");
           }
    }
    // Driver Program
    public static void main(String args[])
    {
        try {

            checkNumber();
            
            
        }
        catch (MyException1 ex) {
             System.out.println(ex.getMessage());
        }
        catch (MyException2 ex)
        {
            System.out.println(ex.getMessage());
            
        }
        catch (MyException3 ex)
        {
            System.out.println(ex.getMessage());
            
        }
    }
}