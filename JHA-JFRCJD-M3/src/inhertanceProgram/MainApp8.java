package inhertanceProgram;

public class MainApp8 {
    public static void main(String[] args) {
        Amazon2 a1 = new Amazon2();
        a1.payment("abc@paytm");
        a1.payment("abc@icici" , 1234);
        a1.payment(576 , "04/29" , 1234556 , 2505);

        String str = "core java";

        System.out.println( str.substring(3));
        System.out.println( str.substring(3, 7));
    }
}
