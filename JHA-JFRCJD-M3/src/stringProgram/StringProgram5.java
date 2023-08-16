package stringProgram;

public class StringProgram5 {
    public static void main(String[] args) {
        String ans = "";
        String str = "a2b3c1" ;
        int diff = 0 ;
        for (int i = 1 ; i<str.length() ; i+=2) {
            diff = str.charAt(i) - '0';
            char ch = str.charAt(i-1) ;
            while (diff-->0)
                ch++;
            ans += str.charAt(i-1) +""+ch ;
        }

        System.out.println(ans);
    }
}
