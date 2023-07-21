class Student
{
	int rollNo ;
	String name ;
	double marks ;
	
	Student( int rollNo , String name , double marks )
	{
		this.rollNo = rollNo ;
		this.name = name ;
		this.marks = marks ;
	}	
	
	public void display()
	{
		System.out.println("ROLL NO : "+ rollNo );
		System.out.println("NAME : "+ name);
		System.out.println("MARKS : "+ marks );
	}
}

class MainApp15
{
	public static void main(String[] args)
	{
		Student s1 = new Student(11 , "abc" , 50);
		s1.display();
	}
}






















