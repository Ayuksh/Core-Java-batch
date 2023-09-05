package abstraction;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("SELECT THE WHATSAPP VERSION ");
        System.out.println("1. PUBLIC WHATSAPP");
        System.out.println("2. PRIVATE WHATSAPP");
        int ch = sc.nextInt() ;
        WhatsApp wh ;
        if (ch == 1)
            wh = new PublicWhatsApp();
        else
            wh = new PrivateWhatsApp() ;

        wh.sendMessage();
        wh.whatsAppCalling();
        wh.whatsAppStatus();
    }
}
