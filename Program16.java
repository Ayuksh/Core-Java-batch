class Program16
{
	public static int avgCalculator(int m1 , int m2 , int m3 )
	{
		int avg = (m1 + m2 + m3)/3 ;
		return avg ;
	}	
		
	public static void display(String name , int m1 , int m2 ,int m3)
	{
		System.out.println("---------------------");
		System.out.println("NAME OF STUDENT : "+ name );
		System.out.println("SUBJECT 1 : "+ m1);
		System.out.println("SUBJECT 2 : "+ m2);
		System.out.println("SUBJECT 3 : "+ m3);
		System.out.println("---------------------");
		System.out.println("AVERAGE OF MARKS : "+ avgCalculator(m1 , m2 , m3));
	}

	public static void main(String[] args)
	{
		display("Omkar" , 50 , 50 , 50 );
		display("Arun" , 70 , 40 , 100);
	}
}























