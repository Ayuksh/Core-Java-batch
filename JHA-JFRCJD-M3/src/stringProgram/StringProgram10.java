package stringProgram;

public class StringProgram10 {
    public static void main(String[] args) {
        String str = "this is core java batch";
        String[] arr = str.split(" ");
        String ans = "";
        for (String s: arr)
        {
              char c1 = s.charAt(0) ;       char c2 =   s.charAt(s.length()-1);
            String s2 = (s.toUpperCase().substring(1 , s.length()-1));
            ans = ans.concat( c1+s2+c2  +" " );
        }
        ans = ans.trim() ;
        System.out.println(ans);
    }
}
