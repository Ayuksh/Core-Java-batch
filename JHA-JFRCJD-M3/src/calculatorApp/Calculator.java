package calculatorApp;

public class Calculator {
    int num1 , num2 ;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add()
    {
        System.out.println("SUM OF NUM1 AND NUM2 "+ (num1 + num2));
    }

    public void sub()
    {
        System.out.println("SUB OF NUM1 AND NUM2 "+ (num1 - num2));
    }

    public void mul()
    {
        System.out.println("MUL OF NUM1 AND NUM2 "+ (num1 * num2));
    }

    public void div()
    {
        System.out.println("DIV OF NUM1 AND NUM2 "+ (num1 / num2));
    }
}
