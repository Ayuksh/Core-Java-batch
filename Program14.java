class Program14
{
	public static int square(int a)
	{
		int sq = a * a ;
		return sq ;
	}

	public static void areaOfCircle(int r)
	{
		double area = 3.14 * square(r) ;
		System.out.println("AREA : "+ area );
	}
	
	public static void main(String[] args)
	{
		System.out.println("MAIN METHOD START");
		areaOfCircle( 10 );
		areaOfCircle( 20 );
		areaOfCircle( 1 );
		System.out.println("MAIN METHOD END ");
	}
}