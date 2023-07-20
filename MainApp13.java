class Animal
{
	int hands ;
	int legs ;
	double wings ;

	Animal(int l)
	{
		legs = l;	
	}
	
	Animal(int h , int l)
	{
		hands = h ;
		legs = l ;
	}
	
	Animal(int l , double w)
	{
		legs = l ;
		wings = w ;
	}
	
	public void display()
	{
		System.out.println("------------------------");
		System.out.println("HANDS "+ hands );
		System.out.println("LEGS "+ legs );
		System.out.println("WINGS "+ wings);
	}
}

class MainApp13
{
	public static void main(String[] args)
	{
		Animal human = new Animal(2 , 2);
		human.display();
		Animal bird = new Animal(2 , 2.0);
		bird.display();
		Animal tiger = new Animal( 4 );
		tiger.display();
		Animal lion = new Animal( 4 );
		lion.display();
	}
}














