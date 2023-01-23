package collectionsdemo;
// We use < > to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) //passing object as a parameter 
    { 
        this.obj = obj; 
    } // constructor
    public T getObject() //return object as a paramter
    { 
        return this.obj;
     }
}
public class GenericDemo {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        Test<String> iObj2 = new Test<String >("Dhruvi");
        System.out.println(iObj2.getObject());

        Test<Double> iObj3 = new Test<Double >(34.5);
        System.out.println(iObj3.getObject());

        System.out.println("addition "+iObj.getObject()+iObj3.getObject());
    }
}
