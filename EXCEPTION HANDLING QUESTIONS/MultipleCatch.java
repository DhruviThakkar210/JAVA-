package nov10;

public class MultipleCatch {
   
public static void main(String[] args) {
    try {
        int a=10,b=5;
        int c=a/b;
        System.out.println("division "+c);
        String s="hally";
        System.out.println("length "+s.length());
       int ar[]={11,2,33,4,55};
       System.out.println(ar[9]);
    } catch (ArithmeticException e) {
        System.out.println("error "+e);
    }catch(NullPointerException n)
    {
        System.out.println("error "+n);
    }catch(ArrayIndexOutOfBoundsException ae)
    {
        System.out.println("error "+ae);
    }catch(Exception e)
    {
        System.out.println("error ");
    }
    System.out.println("end of main ");
}
}