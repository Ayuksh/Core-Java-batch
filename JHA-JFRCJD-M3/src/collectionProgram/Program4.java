package collectionProgram;

import java.util.ArrayList;

public class Program4 {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(20);
        System.out.println(l1);

        Integer temp = (Integer) l1.get(0);
        l1.set(0 , l1.get(1));
        l1.set(1 , temp );

        System.out.println(l1);




    }

}
