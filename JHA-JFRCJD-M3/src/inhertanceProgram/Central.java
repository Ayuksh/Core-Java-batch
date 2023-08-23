package inhertanceProgram;

public class Central extends Master{
    Central(int a)
    {
        super(10 , 20);
        System.out.println("CENTRAL CONSTRUCTOR !!");
    }
    public void centralMethod()
    {
        System.out.println("CENTRAL METHOD !!");
    }
}
