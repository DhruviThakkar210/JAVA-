package collectionsdemo;
// Java program to show multiple
// type parameters in Java Generics

// We use < > to specify Parameter type
class Test1<T, U>
{
	T obj1; // An object of type T
	U obj2; // An object of type U

	// constructor
	Test1(T obj1, U obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	// To print objects of T and U
	public void print()
	{
       
		System.out.println(obj1);
		System.out.println(obj2);
        
	}
    void addition()
    {
        Integer  x=(Integer) obj1;
        Integer y=(Integer) obj2;
        System.out.println("Addition "+(x+y));
    }
    
}

// Driver class to test above
class Main2
{
	public static void main (String[] args)
	{
		Test1 <String, Integer> obj =
			new Test1<String, Integer>("GfG", 15);



		obj.print();

        Test1 <Integer, Integer> obj1 =
			new Test1<Integer, Integer>(34, 15);
            obj1.print();
            obj1.addition();
            
	}
}

