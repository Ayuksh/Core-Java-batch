package ObjectComposition;

public class Car {

    Engine e1 = new Engine();
    FMRadio f1 = new FMRadio();

    public void drive()
    {
        System.out.println("DRIVING CAR");
    }

    public void stop()
    {
        System.out.println("APPLYING BREAK !!");
    }
}
