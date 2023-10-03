package collectionProgram;

public class Employee {
    int empId ;
    String empName ;
    String empJob ;
    double empSal;

    public Employee(int empId, String empName, String empJob, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empJob = empJob;
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        System.out.println("------------------------------------------------");
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empJob='" + empJob + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
