package inhertanceProgram;

public class MainApp12 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("ARJUN" , 27 , 1234 , "PUNE" , 25000 , "BACKEND DEVELOPER");
        Manager mgr1 = new Manager("KARAN" , 36 , 7890 , "DELHI" , 40000 , "DEVELOPMENT ");
        emp1.printSalary();
        System.out.println("------------------------");
        mgr1.printSalary();
    }
}
