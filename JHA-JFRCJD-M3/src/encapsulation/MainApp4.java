package encapsulation;

public class MainApp4 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike.Engine e1 = b1.new Engine();
        Bike.Bluetooth b = b1.new Bluetooth();

        b1.start();
        e1.fuelType();
        e1.gearCount();
        b1.stop();
        b.trackDistance();

    }
}
