package inhertanceProgram;

public class Product {
    int productId ;
    String productName ;
    double productPrice ;
    String productMafDate ;
    String productExpDate ;
    double energy ;


    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;

        System.out.println("constructor 1 ;");
    }

    public Product(int productId, String productName, double productPrice, String productMafDate) {
        this(productId , productName , productPrice);
        this.productMafDate = productMafDate;
        System.out.println("constructor 2");
    }

    public Product(int productId, String productName, double productPrice, String productMafDate, String productExpDate) {
        this(productId , productName , productPrice , productMafDate);
        this.productExpDate = productExpDate;
        System.out.println("constructor 3");
    }

    public Product(int productId, String productName, double productPrice, String productMafDate, String productExpDate, double energy) {
        this(productId , productName , productPrice , productMafDate , productExpDate);
        this.energy = energy;
        System.out.println("constructor 4");
    }
}
