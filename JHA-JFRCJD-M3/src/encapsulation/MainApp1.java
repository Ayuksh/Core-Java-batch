package encapsulation;

public class MainApp1 {
    public static void main(String[] args) {
        Bank b1 = new Bank(1234 , "AMAN" , 100.99) ;
        b1.setBankBalance(50);

        System.out.println(b1.getName()+" bank balance "+b1.getBankBalance());

        Bank b2 = new Bank(7890 , "TEJAS" , 700.89);
        System.out.println(b2.getName()+" bank balance "+ b2.getBankBalance());
    }
}
