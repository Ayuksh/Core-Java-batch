package singleton;

public class MainApp2 {
    public static void main(String[] args) {
        Google g1 = Google.createAccount() ;

        g1.gmail();
        g1.googleNews();
        g1.youtube();

        System.out.println(g1);

    }
}
