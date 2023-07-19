class Shop
{
	int shopId ;
	String shopName ;
	String shopType ;

	 void Shop(int id , String name , String type)
	{
		shopId = id ;
		shopName = name ;
		shopType = type ;
	}
	
	public void display()
	{
		System.out.println("ID : "+ shopId );
		System.out.println("NAME : "+ shopName );
		System.out.println("TYPE : "+ shopType );
	}
}
	
class MainApp10
{
	public static void main(String[] args)
	{
		Shop s1 = new Shop();
		Shop s2 = new Shop();
		s2.shopId = 2022;
		s1.display();
		s2.display();
	}
}





















