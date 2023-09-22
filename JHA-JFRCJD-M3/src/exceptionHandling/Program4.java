package exceptionHandling;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10 , 20 , 30 , 40 };

        System.out.println("ENTER A NUMBER ");
        String a = sc.next() ;
        try {
            int idx = Integer.parseInt(a);
            if(idx < arr.length)
                System.out.println(arr[idx]);
            else
                System.out.println("invalid idx ");
        }catch (Exception e)
        {
            System.out.println(e);
        }







//        try {
//            int idx = Integer.parseInt(a);
//            try {
//                System.out.println(arr[idx]);
//            }catch (ArrayIndexOutOfBoundsException i)
//            {
//                System.out.println(i);
//            }
//        }catch (NumberFormatException n )
//        {
//            System.out.println(n);
//        }
    }
}
