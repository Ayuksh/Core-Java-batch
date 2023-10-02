package collectionProgram;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(40);
        list1.add(30);
        list1.add(50);
        list1.add(10);

//        int len = list1.size();
//        System.out.println(len);
//        System.out.println(list1);


        Object o = list1.get(1);
        System.out.println(o);

    }
}
