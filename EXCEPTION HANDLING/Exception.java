class Exception {
    public static void main(String[] args)
    {
        int a = 10, b = 10,  result;
        try {
            result = a / b ;
            System.out.println("result" + result);
        }
 
        catch (ArithmeticException e) {
            System.out.println("Exception caught:Division by zero");
        }
 
        finally {
            System.out.println("I am in final block");
        }
    }
}