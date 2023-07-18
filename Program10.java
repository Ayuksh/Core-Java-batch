class Program10
{
	public static void average(int m1 , int m2 , int m3 , int m4 , int m5 )
	{
		int sum = m1+m2+m3+m4+m5 ;
		int avg = sum / 5 ;
		
		System.out.println("AVERAGE OF MARKS = "+ avg);
	}
		
	public static void main(String[] args)
	{
		average( 50 , 50 , 50 , 50 , 50 );
	}
}