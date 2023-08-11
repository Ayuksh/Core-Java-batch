package array;

public class Laptop {
    String companyName ;
    String model ;
    int ram ;
    double price ;

    public Laptop(String companyName, String model, int ram, double price) {
        this.companyName = companyName;
        this.model = model;
        this.ram = ram;
        this.price = price;
    }

    public void displayDetails()
    {
        System.out.println("COMPANY NAME "+ companyName);
        System.out.println("LAPTOP MODEL "+ model );
        System.out.println("LAPTOP RAM "+ ram);
        System.out.println("LAPTOP PRICE "+ price);
    }
}
