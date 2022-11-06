class Key
{
 final int x = 100 ;
 void display()
 {

 	System.out.println("in the final block :" + x);
 }

}


class Final extends Key
{
	void display()
	{
	   super.display();
	}
}

public class FinalKey
{
	public static void main(String[] args) {
		Final a = new Final();
		a.display();
	}
}