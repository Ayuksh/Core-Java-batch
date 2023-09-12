package accessModifier;

public class Demo {

    private  void privateMethod()
    {
        System.out.println("PRIVATE METHOD ");
    }
    void packageMethod()
    {
        System.out.println("PACKAGE LEVEL METHOD ");
    }
    protected void protectedMethod()
    {
        System.out.println("PROTECTED METHOD ");
    }
    public void publicMethod()
    {
        System.out.println("PUBLIC METHOD !!");

    }
}
