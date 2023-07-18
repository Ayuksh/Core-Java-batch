import java.util.Scanner ;
	
class Product
{
	int pId ;
	String pName ;
	double pPrice ;
	
	public void display()
	{
		System.out.println("------------------");
		System.out.println("ID : "+ pId);
		System.out.println("NAME : "+ pName);
		System.out.println("PRICE : "+ pPrice);
	}
	
}

class MainApp8
{
	static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args)
	{
		Product p1 = getProduct();
		Product p2 = getProduct();
		Product p3 = getProduct();		

		if( p1.pPrice < 100 )
			p1.display();
		if(p2.pPrice < 100 )
			p2.display();
	}

	public static Product getProduct()
	{
		System.out.println("--------------------");
		Product pro = new Product();
		
		System.out.println("ENTER ID ");
		pro.pId = sc.nextInt();
		System.out.println("ENTER NAME ");
		pro.pName = sc.next();	
		System.out.println("ENTER PRICE ");
		pro.pPrice = sc.nextDouble();
		
		return pro;	
	}	
}


















		