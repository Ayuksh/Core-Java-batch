package abstraction;

public class SolarLIght implements Switch{
    @Override
    public void switchON() {
        System.out.println("SOLAR LIGHT SWITCH ON");
    }

    @Override
    public void switchOff() {
        System.out.println("SOLAR LIGHT SWITCH OFF ");
    }
}
