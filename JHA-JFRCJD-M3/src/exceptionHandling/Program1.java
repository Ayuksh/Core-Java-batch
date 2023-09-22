package exceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        System.out.println("stmt2");
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException a){
            System.out.println(a);
        }
        System.out.println("stmt4");
        System.out.println("stmt5");
    }
}
