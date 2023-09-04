package abstraction;

public class MainApp1 {
    public static void main(String[] args) {
        Demo.show();
        System.out.println(Demo.a);
        Sample d1 = new Sample(10);
        System.out.println(d1.b);
        d1.text();
        d1.display();
    }
}
