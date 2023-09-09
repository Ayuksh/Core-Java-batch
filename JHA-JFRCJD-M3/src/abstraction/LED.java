package abstraction;

public class LED implements Switch{
    @Override
    public void switchON() {
        System.out.println("LED SWITCH ON");
    }

    @Override
    public void switchOff() {
        System.out.println("LED SWITCH OFF");
    }
}
