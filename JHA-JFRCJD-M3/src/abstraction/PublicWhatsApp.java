package abstraction;

public class PublicWhatsApp extends WhatsApp{

    @Override
    public void sendMessage() {
        System.out.println("ANY ONE CAN SEND MESSAGE ");
    }

    @Override
    public void whatsAppCalling() {
        System.out.println("ANYONE CAN CALL ON WHATSAPP");
    }

    @Override
    public void whatsAppStatus() {
        System.out.println("ANY ONE CAN SEE WHATSAPP STATUS ");
    }
}
