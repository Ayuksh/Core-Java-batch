package abstraction;

public class PrivateWhatsApp extends WhatsApp{
    @Override
    public void sendMessage() {
        System.out.println("ONLY CONTACTS CAN MESSAGE ");
    }

    @Override
    public void whatsAppCalling() {
        System.out.println("ONLY CONTACTS CAN CALL !!");
    }

    @Override
    public void whatsAppStatus() {
        System.out.println("ONLY CONTACTS CAN SEE UR STATUS !!");
    }
}
