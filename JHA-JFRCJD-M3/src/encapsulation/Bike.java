package encapsulation;

public class Bike {
    public void start(){
        System.out.println("BIKE STARTED !!");
    }
    public void stop(){
        System.out.println("BIKE STOPPED !!");
    }

    class Engine{
        public void fuelType(){
            System.out.println("FUEL TYPE IS PETROL !! ");
        }
        public void gearCount(){
            System.out.println("BIKE HAS 5 GEARS !!");
        }
    }

    class Bluetooth{
        public void trackDistance(){
            System.out.println("TRACKING DISTANCE !!");
        }
    }
}
