package abstraction;

public class GooglePay extends AmazonPayment{
    @Override
    public void receiveMessage() {
        System.out.println("RECEIVING MESSAGE FROM GOOGLE PAY ");
    }

    @Override
    public void transaction() {
        System.out.println("TRANSACTION IS DONE BY GOOGLE PAY");
    }

    @Override
    public void getBill() {
        System.out.println("TRANSACTION HISTORY STORED IN GOOGLE PAY ");
    }
}
