package inhertanceProgram;

public class Employee extends Member{

    String specialization ;

    public Employee(String name, int age, int phnNo, String address, double salary, String specialization) {
        super(name, age, phnNo, address, salary);
        this.specialization = specialization;
    }

    @Override
    public void printSalary() {
        super.printSalary();
        System.out.println(" SPECIALIZATION : "+ specialization);
    }
}
