package abstraction;

public class MainApp8 {
    public static void main(String[] args) {
        ShopInfo medicalShop =  (int b , char c) -> {
            System.out.println(b+ " THIS IS MEDICAL SHOP "+ c);
        } ;

        ShopInfo superMarket = (int b , char c) -> {
            System.out.println(b+" THIS IS GROCERY SHOP "+c);
        } ;



        ShopInfo electricShop = (int b , char c) -> {
            System.out.println(b+" THIS IS ELECTRIC SHOP "+c);
        };

        medicalShop.shopType( 10  , 'A');
        superMarket.shopType(20 , 'B');
        electricShop.shopType(30 , 'C');
        medicalShop.shopType(40 , 'D' );
    }
}
