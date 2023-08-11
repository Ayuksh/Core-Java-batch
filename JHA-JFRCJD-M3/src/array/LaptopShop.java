package array;

public class LaptopShop {
    public static void main(String[] args) {
        Laptop[] laptops  ;   // declaration
        laptops = new Laptop[5];    // size allocation

        laptops[0] = new Laptop("HP" , "1234abc" , 8 , 52000.99) ;
        laptops[1] = new Laptop("Dell" , "1ecd234" , 16 , 80000.75);
        laptops[2] = new Laptop("Lenovo" , "1234abc" , 8 , 52000.99) ;
        laptops[3] = new Laptop("Asus" , "1ecd234" , 16 , 80000.75);
        laptops[4] = new Laptop("Apple" , "1234abc" , 8 , 52000.99) ;

        for (Laptop l : laptops) {
            l.displayDetails();
            System.out.println("--------------------");
        }

//        for(int i =0 ; i< laptops.length ; i++) {
//            System.out.println(laptops+"  --->  ");
//            laptops[i].displayDetails();
//            System.out.println("=======================");
//        }
    }
}
