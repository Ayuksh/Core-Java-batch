package singleton;

public class MainApp {
    public static void main(String[] args) {

        Google acc = Google.createAccount();
        Google acc1 = Google.createAccount() ;

        System.out.println(acc);
        System.out.println(acc1);
        for (int i =0 ; i<10 ; i++)
        {
            System.out.println(Google.createAccount());
        }
    }
}
