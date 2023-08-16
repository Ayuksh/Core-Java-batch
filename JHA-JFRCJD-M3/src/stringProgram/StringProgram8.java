package stringProgram;

public class StringProgram8 {
    public static void main(String[] args) {
        String str = "AbAbA";
        str = str.substring(0 , 2) +"*" + str.substring(3);
        System.out.println(str);
    }
}
