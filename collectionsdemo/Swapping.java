package collectionsdemo;


class Test3<T> 
{
    T obj1,obj2;
    T obj3 ;
    Test3(T obj1,T obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public T swap()
    {

        System.out.println("before it was " + obj1+ "  " + obj2);
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj3;
        System.out.println("now it is :" + obj1+"  " + obj2);
        return obj1;

    }
}
public class Swapping {
    public static void main(String[] args) {
        Test3<Integer> x = new Test3<>(2,3);
        x.swap();
     
    }
}
