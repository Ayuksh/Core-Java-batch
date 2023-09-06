package abstraction;

public class MainApp6 {
    public static void main(String[] args) {
        Master c1 = new Central();
        c1.display();
        Master.show();
        System.out.println(Master.a);
    }
}
