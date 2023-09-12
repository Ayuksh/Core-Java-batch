package encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(1011 , "hp notebook" ,
                "intel i3" , 4 , 55000);

        Laptop l2 = new Laptop(2023 , "lenovo thinkpad",
                "intel i5" , 4 , 35000);


        l1.setLaptopRam(8);

        System.out.println("laptop details ");
        System.out.println(l1.getLaptopId());
        System.out.println(l1.getLaptopModel());
        System.out.println(l1.getLaptopRam());
        System.out.println(l1.getLaptopProcessor());
        System.out.println(l1.getLaptopPrice());
    }
}
