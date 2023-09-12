package encapsulation;

public class Laptop {
    private int laptopId ;
    private String laptopModel ;
    private String laptopProcessor ;
    private int laptopRam ;
    private double laptopPrice ;

    public Laptop(int laptopId, String laptopModel,
                  String laptopProcessor, int laptopRam,
                  double laptopPrice) {
        this.laptopId = laptopId;
        this.laptopModel = laptopModel;
        this.laptopProcessor = laptopProcessor;
        this.laptopRam = laptopRam;
        this.laptopPrice = laptopPrice;
    }

    public int getLaptopId()
    {
        return laptopId ;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public String getLaptopProcessor() {
        return laptopProcessor;
    }

    public int getLaptopRam() {
        return laptopRam;
    }

    public void setLaptopRam(int laptopRam) {
        this.laptopRam = laptopRam;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
