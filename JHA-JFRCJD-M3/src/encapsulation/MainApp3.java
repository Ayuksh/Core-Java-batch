package encapsulation;

public class MainApp3 {
    public static void main(String[] args) {
        Demo d1 = new Demo() ;
        System.out.println( d1.a );
        d1.display();
        Demo.Sample s1 = d1.new Sample();
        System.out.println(s1.b);
        s1.show();
    }
}
