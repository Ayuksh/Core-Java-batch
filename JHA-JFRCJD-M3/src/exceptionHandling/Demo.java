package exceptionHandling;

public class Demo {

    public static void master()
    {
        System.out.println("MASTER METHOD START");
            System.out.println(10 / 0);
        System.out.println("MASTER METHOD END ");
    }

    public static void central()
    {
        System.out.println("CENTRAL METHOD START");
            master();
        System.out.println("CENTRAL METHOD END ");
    }

    public static void main(String[] args) {
        System.out.println("MAIN METHOD START");
        try{
        central();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("MAIN METHOD END ");
    }


}
