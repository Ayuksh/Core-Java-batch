package inhertanceProgram;

public class Manager extends Member{
    String department ;

    public Manager(String name, int age, int phnNo, String address, double salary, String department) {
        super(name, age, phnNo, address, salary);
        this.department = department;
    }


        @Override
    public void printSalary() {
        super.printSalary();
        System.out.println("DEPARTMENT : "+ department);
    }
}
