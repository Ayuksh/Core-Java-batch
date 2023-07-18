class Program12
{
	public static int area(int len , int wid )
	{
		int a = len + wid ;
		return a;
	}
	
	public static void main(String[] args)
	{
		int areaA = area( 9 , 5 );
		int areaB = area( 20 , 10 );
		int totalArea = areaA + areaB ;
		System.out.println("TOTAL AREA = "+ totalArea );
	}
}