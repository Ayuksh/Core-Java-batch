package collectionProgram;

import java.util.ArrayList;

public class Program5 {
    public static void main(String[] args) {
        char[] arr = {'A' , 'b' , 'C' , 'D' , 'E'};
        ArrayList list1 = new ArrayList();
        for (int i =0 ; i<arr.length ; i++)
            list1.add( arr[i] );

        System.out.println( list1 );
    }
}
