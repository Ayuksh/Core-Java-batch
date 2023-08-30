package inhertanceProgram;

public class Member {
    String name ;
    int age ;
    int phnNo ;
    String address ;
    double salary ;

    public Member(String name, int age, int phnNo, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phnNo = phnNo;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary()
    {
        System.out.println("NAME    : "+ name );
        System.out.println("AGE     : "+ age );
        System.out.println("PHN NO  : "+ phnNo);
        System.out.println("ADDRESS : "+ address);
        System.out.println("SALARY  : "+ salary);
    }
}


