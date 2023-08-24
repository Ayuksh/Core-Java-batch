package inhertanceProgram;

public class Amazon2 {
    public void payment(String upi )
    {
        System.out.println("PAYMENT DONE BY UPI ");
    }

    public  void payment(String upi , int password )
    {
        System.out.println("PAYMENT DONE BY UPI APPLICATION");
    }

    public void payment (int cvv , String expDate , long cardno , int otp)
    {
        System.out.println("PAYMENT DONE BY card");
    }
}
