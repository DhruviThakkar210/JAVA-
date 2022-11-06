

public class FinalVariable {
    final int MAX=100;//final variable 
    final int MIN;//blank final variable 
    static final int NORM;//static blank final variable 
    //constructor 
    FinalVariable()
    {
        MIN=200;
      
    }
    //static block 
    static 
    {
        NORM=300;
    }
    void show()
    {
       // MAX=MAX*5;
    
     System.out.println("final variable  "+MAX);
        System.out.println("blank final variable "+MIN);
        System.out.println("static blank final variable "+FinalVariable.NORM);
    }
    public static void main(String[] args) {
        FinalVariable obj=new FinalVariable();
        obj.show();
    }
}