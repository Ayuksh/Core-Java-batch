package stringProgram;

public class StringProgram3 {
    public static void main(String[] args) {
        String s1 ="This is CORE JAVA batch ";

        String revS1 = "";
        int lastIdx = s1.length()-1 ;
        for (int i = lastIdx ; i>=0 ; i--)
           revS1 +=  s1.charAt(i);


        System.out.println(revS1);


    }
}
