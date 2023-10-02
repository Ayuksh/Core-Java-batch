package collectionProgram;

import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();
        l1.add(10);
        l1.add(5);
        l1.add(30);
        l1.add(40);
        l1.add(25);
        int m1 = 10 ;
        Integer min = (Integer) l1.get(0);
        for (int i =0 ; i<l1.size() ; i++)
        {
            if ( (Integer)l1.get(i) < min )
                    min = (Integer) l1.get(i);
        }
        l1.remove(min);
        System.out.println(l1);
    }
}
