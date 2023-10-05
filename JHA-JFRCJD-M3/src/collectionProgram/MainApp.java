package collectionProgram;

import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static StudentManagement studentManagement = new StudentManagement();
    public static void main(String[] args) {

        System.out.println("SELECT OPTION ");
        System.out.println("1. ADD STUDENT ");
        System.out.println("2. REMOVE STUDENT ");
        System.out.println("3. DISPLAY STUDENT ");
        System.out.println("4. SEARCH STUDENT ");
        int ch = sc.nextInt();


        switch (ch)
        {
            case 1 :
                    addStudent();
                break;
            case 2:
                    removeStudent();
                break;
            case 3:
                studentManagement.displayStudent();
                break;
            case 4:
                searchStudent();
                break;
        }

        main(args);
    }

    public static void addStudent()
    {
        System.out.println("ENTER STUDENT ID ");
        int id = sc.nextInt() ;
        System.out.println("ENTER STUDENT NAME ");
        String name = sc.next() ;
        System.out.println("ENTER STUDENT MARKS ");
        double marks = sc.nextDouble();
        Student stu = new Student(id , name , marks);
        studentManagement.addStudent(stu);
    }

    public static  void removeStudent()
    {
        System.out.println(" ENTER ID ");
        int id = sc.nextInt();
        studentManagement.removeStudent(id);
    }

    public static void searchStudent()
    {
        System.out.println("ENTER NAME ");
        String name = sc.next() ;
        studentManagement.searchStudent(name);
    }
}
