class Demo
{
	Demo()		//constructor
	{
		System.out.println("CONSTRUCTOR !!");	
	}	

	public void display()
	{
		System.out.println("DISPLAY METHOD ");
	}
}

class MainApp9
{
	public static void main(String[] args)
	{	
		Demo d1 = new Demo();		//call for constructor 
		Demo.display();
	}
}

















