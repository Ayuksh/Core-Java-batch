package stringProgram;

public class StringProgram2 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = "core java";

        System.out.println("<---------- BEFORE REINITIALIZATION -------------->");
        // ADDRESS OF s1 AND s2 ARE SAME
        System.out.println( s1 == s2 );
        System.out.println( s1 == s3 );

        s1 = "core java" ;
        System.out.println("<---------- AFTER REINITIALIZATION -------------->");
        // ADDRESS of s1 AND s3 ARE SAME
        // ADDRESS OF s1 IS CHANGED
        System.out.println( s1 == s2 );
        System.out.println( s1 == s3 );
    }
}
