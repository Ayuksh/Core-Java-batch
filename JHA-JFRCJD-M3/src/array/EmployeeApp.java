package array;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TOTAL EMPLOYEE ");
        int size = sc.nextInt() ;

        Employee[] empList = new Employee[ size ];

        for(int i =0 ; i<size ; i++) {
            System.out.println("ENTER ID");
            int id = sc.nextInt();
            System.out.println("ENTER NAME ");
            String name = sc.next();
            System.out.println("ENTER SALARY ");
            double salary = sc.nextDouble();
            System.out.println("ENTER JOB ");
            String job = sc.next();
            empList[i] = new Employee(id, name, salary, job);
        }

        for(Employee e: empList)
        {
            System.out.println("--------------------");
            e.display();
        }


    }
}
