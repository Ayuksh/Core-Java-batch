package inhertanceProgram;

public class MainApp1 {
    public static void main(String[] args) {
        BMW b1 = new BMW(); // subclass
        b1.horsePower();
        b1.topSpeed();
        b1.safety();

        Car c1 = new Car(); // super class
        c1.horsePower();
        c1.topSpeed();
    }
}
