class Program33
{
	public static void main(String[] args)
	{
		int a = 67 ;
		
		String ans = (a%3 == 0)? ((a%5==0)? "3&5": "only 3")  : ((a%5==0)?"only 5":"invalid number" );
		System.out.println(ans);
		
	}
}