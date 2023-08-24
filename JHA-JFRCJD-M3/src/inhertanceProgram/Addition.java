package inhertanceProgram;

public class Addition {
    public void add(int a)
    {
        System.out.println("A : "+ a);
    }

    public void add(int a , int b)
    {
        System.out.println("A + B : "+ (a+b));
    }

    public void add(int a , double b)
    {
        System.out.println("A + B" + (a+b));
    }

    public void add(double b  ,  int a )
    {
        System.out.println("A + B" + (a+b));
    }
}
