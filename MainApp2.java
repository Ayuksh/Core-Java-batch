class Sample
{
	int a = 50;	// non static data member 

	public void display()	// non static function member
	{
		System.out.println("DISPLAY METHOD !!");
	}
}

class MainApp2
{
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD !!");
		new Sample().display();

		int sum = new Sample().a * 2;
		
		System.out.println("SUM IS "+ sum); 


	}
}
		