package stringProgram;

public class StringProgram9 {
    public static void main(String[] args) {
        String str = "This is core java Batch";

        String ans = "";
       for (String s : str.split(" "))
       {
           ans += (s.substring(0 , s.length()-1) + s.toUpperCase().charAt( s.length()-1)+" ");
       }
        ans = ans.trim();
        System.out.println(ans);
        System.out.println(str.length() == ans.length());
    }
}
