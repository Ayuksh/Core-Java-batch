package collectionProgram;

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s)
    {
        studentList.add(s);
    }
    public void removeStudent(int id )
    {
        for (Student s : studentList)
        {
            if (s.getStudentId() == id) {
                studentList.remove(s);
                break;
            }
        }
    }

    public void displayStudent()
    {
        for (Student s : studentList)
            System.out.println(s);
    }

    public void searchStudent(String name)
    {
        for (Student s : studentList)
            if (s.getStudentName().equals(name))
                System.out.println(s);
    }

    public void findFailStudent()
    {
        for (Student s : studentList)
            if (s.getStudentMarks()<35)
                System.out.println(s);
    }

}
