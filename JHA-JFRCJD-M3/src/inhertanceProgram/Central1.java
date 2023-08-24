package inhertanceProgram;

public class Central1 extends Sample1{
    int a = 400 ;
    int b = 500 ;

    public void display()
    {
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(a);
        System.out.println(b);
    }
}
