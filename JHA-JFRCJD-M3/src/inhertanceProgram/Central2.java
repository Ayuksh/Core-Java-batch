package inhertanceProgram;

public class Central2 extends Master2{
    public void test()
    {
        System.out.println("CENTRAL CLASS , TEST METHOD !!");
    }

    @Override
    public void display(int a) {
        System.out.println("CENTRAL CLASS , DISPLAY METHOD ");
    }
}
