package singleton;

public class MainApp {
    public static void main(String[] args) {

        Google acc = Google.createAccount();

       acc.youtube();
       acc.googleNews();
       acc.gmail();

        System.out.println(acc);
    }
}
