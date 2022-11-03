class Mom {
    int a ;
    Mom()
    {
        a = 100;

    }
    void display() {
        System.out.println("parent class method ");
    }
}

class Dhruvi extends Mom{
    int a ;
    Dhruvi()
    { 
        a = 200;
        System.out.println("value of a in mom class is " + a);
        System.out.println("value of a in mom class is " + super.a);
        
    }
    void display() {
        super.display();
        System.out.println("child class method");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Dhruvi v = new Dhruvi();
        v.display();
    }
}
