package array;

public class Employee {
    int empId ;
    String empName ;
    double salary ;
    String job ;

    public Employee(int empId, String empName, double salary, String job) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.job = job;
    }

    public void display()
    {
        System.out.println("ID : "+ empId);
        System.out.println("NAME : "+ empName);
        System.out.println("SALARY : "+ salary);
        System.out.println("JOB "+ job);
    }
}
