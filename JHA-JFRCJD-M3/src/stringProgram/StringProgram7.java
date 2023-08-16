package stringProgram;

public class StringProgram7 {
    public static void main(String[] args) {
        String str = "QspIDerS";

        for (int i =0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if (ch >='A' && ch<='Z')
                System.out.print((ch+"").toLowerCase());
            else
                System.out.print((ch+"").toUpperCase());
        }
    }
}
