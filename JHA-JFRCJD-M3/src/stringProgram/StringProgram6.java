package stringProgram;

import java.util.Scanner;

public class StringProgram6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER A STRING VALUE ");
        String str = sc.next() ;

        String ans = "";
        char[] arr = str.toCharArray() ;
        for (char c : arr)
           ans += (c-'@')+" ";

        System.out.println(ans);
    }
}
