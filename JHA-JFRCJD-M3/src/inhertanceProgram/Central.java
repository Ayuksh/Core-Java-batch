package inhertanceProgram;

public class Central extends Master{
    Central()
    {
        super(10 , 20);
        System.out.println("CENTRAL CONSTRUCTOR !!");
    }
    public void centralMethod()
    {
        System.out.println("CENTRAL METHOD !!");
    }
}
