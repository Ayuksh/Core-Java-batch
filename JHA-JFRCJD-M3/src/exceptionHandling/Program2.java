package exceptionHandling;

public class Program2 {
    public static void main(String[] args) {
        String s = null ;
        try {
            System.out.println(s.length());
        }catch (NullPointerException cj)
        {
            System.out.println(cj);
        }
    }
}
