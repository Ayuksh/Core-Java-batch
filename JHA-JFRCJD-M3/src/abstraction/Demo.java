package abstraction;

public abstract class Demo {
    static int a = 10 ;
    int b = 20 ;

    static {
        System.out.println("STATIC BLOCK ");
    }

    {
        System.out.println("NON STATIC BLOCK !!");
    }

    public Demo(int a) {
        System.out.println("CONSTRUCTOR !!");
    }

    static void show()
    {
        System.out.println("SHOW METHOD !!");
    }

    void text()
    {
        System.out.println("TEXT METHOD !!");
    }
    public abstract void display() ;
}
