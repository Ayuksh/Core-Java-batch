package ObjectComposition;

public class MainApp1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.f1.playMusic();
        c1.e1.start();
        c1.drive();
        c1.stop();
        c1.e1.fuelType();
        c1.f1.changeMusic();
    }
}
