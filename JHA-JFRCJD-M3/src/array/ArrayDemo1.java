package array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr ; //declaration
        arr = new int[5] ; //size allocation
//        int[] arr = new int[5] ;  declaration + size allocation

        arr[0] = 10 ;   // initialization
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;

        for (int i =0 ; i<=4 ; i++)
            System.out.println(arr[i]);

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

    }
}
