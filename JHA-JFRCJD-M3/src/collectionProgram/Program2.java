package collectionProgram;

import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {


        ArrayList list1 = new ArrayList();
        list1.add(10);
        list1.add(20.9);
        list1.add("core java");
        list1.add(3);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add("core java");

//        list1.remove(2);
//        list1.remove(3);
//        list1.remove("core java");
        Integer i = 3 ;
        list1.remove(i);
        System.out.println(list1);


    }
}
