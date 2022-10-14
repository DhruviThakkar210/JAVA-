
class Student
{
	int rno;
	String name;
	double per;
	Student()
	{
		rno=101;
		name="hally";
		per=56.7;
	}

	void display()
	{
		System.out.println(rno+" "+name+" "+per);
	}
}
class CtorDemo
{
	public static void main(String[] args) {
		//create an object 
		Student s1=new Student();
		s1.display();
	    Student s2=new Student();
	    s2.display();
	    /*
		Student s3=new Student();*/
	}
}