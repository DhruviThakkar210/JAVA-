class Baa {
    int a;

    Baa() {
        a = 500;
    }
    void display()
    {
        System.out.println("value of baa is " + a);
    }

}

class Mummy extends Baa {
    int a;

    Mummy() {
        a = 200;
    }
    void display()
    {
        super.display();
        System.out.println("value of mummy is " + a);
    }
}

class Dhruv extends Mummy{
    int a;

    Dhruv() {
        a = 100;
    }

    void display() {
        super.display();
        System.out.println("value of dhruvi is " + a);
        

    }

}
public class GrandParent{

public static void main(String[] args) {
    Dhruv v = new Dhruv();
    v.display();
}
}
