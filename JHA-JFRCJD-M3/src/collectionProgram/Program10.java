package collectionProgram;

import java.util.ArrayList;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList();
        empList.add(new Employee(101 , "Aman" , "Manager" , 45000));
        empList.add(new Employee(102 , "Omkar" , "Developer" , 35000));
        empList.add(new Employee(103 , "Amit" , "Tester" , 20000));
        empList.add(new Employee(104 , "Tanmay" , "CEO" , 95000));


        for (Employee e : empList)
            if (e.empJob.equals("Manager"))
                System.out.println(e);
    }
}
