package abstraction;

public class Paytm extends AmazonPayment{
    @Override
    public void receiveMessage() {
        System.out.println("RECEIVING MESSAGE FROM PAYTM ");
    }

    @Override
    public void transaction() {
        System.out.println("TRANSACTION IS DONE BY PAYTM");
    }

    @Override
    public void getBill() {
        System.out.println("TRANSACTION HISTORY STORED IN PAYTM ");
    }
}
