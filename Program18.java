import java.util.Scanner;

class Program18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int empId ;
		String empName ;
		int empAge ;
		double empSalary ;
		char empDept ;
		long empPhn ;

		System.out.println("ENTER EMP ID ");
		empId =	sc.nextInt();
		System.out.println("ENTER EMP NAME ");
		empName = sc.next();	
		System.out.println("ENTER AGE ");
		empAge = sc.nextInt();
		System.out.println("ENTER EMP SALARY ");
		empSalary = sc.nextDouble();
		System.out.println("ENTER EMP DEPARTMENT ");
		empDept = sc.next().charAt(0); 
		System.out.println("ENTER PHN NUMBER ");
		empPhn = sc.nextLong();

		System.out.println("EMP ID         "+ empId );
		System.out.println("EMP NAME       "+ empName );
		System.out.println("EMP AGE        "+ empAge );
		System.out.println("EMP SALARY     "+ empSalary );
		System.out.println("EMP DEPARTMENT "+ empDept);
		System.out.println("EMP PHN NUMBER "+ empPhn );
	}
}		
		
		
		
		