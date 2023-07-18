class Student
{
	int rollNo ;
	String name ;
	double marks ;
	
	public void show()
	{
		System.out.println("ROLL NO : "+ rollNo );
		System.out.println("NAME    : "+ name );
		System.out.println("MARKS   : "+ marks );
	}
}

class ClassRoom
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.rollNo = 101 ;
		s1.name = "ram ";
		s1.marks = 60 ;
		s1.show();
		System.out.println("--------------------");

		Student s2 = new Student();
		s2.rollNo = 202 ;
		s2.name = "ajay";
		s2.marks = 80 ;

		
		s1.marks = 100;

		s1.show();
		System.out.println("--------------------");
		s2.show();
	}
}
		

			
	











