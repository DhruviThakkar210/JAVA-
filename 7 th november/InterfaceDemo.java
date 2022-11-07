interface Shape 
{

void circumference();
void area();

}


class  Rectangle implements Shape 
{
      int length;
      int breadth;
      Rectangle(int length,int breadth )
      {
      	this.length = length;
      	this.breadth = breadth;
      }

    public   void area ()
      {
      	int area = length  * breadth;
      	System.out.println("Area of reactangle is " + area);

      }

    public   void circumference()
      {
      	int circum = 2 * (length  + breadth);
      	System.out.println("Circumference of rectangle is" + circum);
      }

}

class  Circle implements Shape
{

   int radius;


      Circle(int radius )
      {
      	this.radius  = radius ;
      	
      }

    public  void area ()
      {
      	double area = 3.14 * radius  * radius;
      	System.out.println("Area of circle is " + area);

      }

   public   void circumference()
      {
      	double circum = 2 * 3.14 * radius;
      	System.out.println("Circumference of circle is" + circum);
      }
  

}

 public class InterfaceDemo 
 {
public static void main(String[] args)
 {
	 Circle c = new Circle(3);
	 c.area();
	 c.circumference();
Rectangle r = new Rectangle(3,7);
	 r.area();
	 r.circumference();
}
}