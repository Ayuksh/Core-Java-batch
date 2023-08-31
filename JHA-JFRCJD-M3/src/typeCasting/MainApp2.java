package typeCasting;

public class MainApp2 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.subMethod();
        d1.superMethod();

        Sample s1 = new Demo();
        s1.superMethod();

    }
}
