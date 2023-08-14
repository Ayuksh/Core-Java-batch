package stringProgram;

public class StringProgram1 {
    public static void main(String[] args) {
        String s1 = "core java" ; // object creation without using new operator
        String s2 = new String("CORE JAVA"); // boject creation with using new operator

        String s3 = "core java";
        String s4  = new String("core java");

        int a = 10 , b = 10 ;
        System.out.println("S1 : "+ s1);
        System.out.println("S2 : "+ s2);

//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println(s2 == s4);

        System.out.println(  s1.equals(s2)  );
        System.out.println( s1.equalsIgnoreCase( s2 ));

    }
}
