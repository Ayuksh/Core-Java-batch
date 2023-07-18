class Human
{
	int hands = 2;
	int legs = 2 ;
	
	public void display()
	{ 
		System.out.println("HANDS : "+ hands );
		System.out.println("LEGS  : "+ legs );
	}
}

class Earth
{
	public static void main(String[] args)
	{
		Human h1 = new Human();
		Human h2 = new Human();
				
		h1.hands = 1 ;
		h2.legs = 3 ;
		
		h1.display();
		System.out.println("--------------");
		h2.display();
	}
}

	
		