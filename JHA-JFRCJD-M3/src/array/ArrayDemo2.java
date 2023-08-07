package array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        char[] arr = { 'A' , 'B' , 'C' , 'D' , 'E'};
        int i = 0 ;
//        while( i <= 4 )
//        {
//            System.out.println(arr[i]);
//            i++ ;
//        }

        for( char c : arr )
            System.out.println(c);

    }
}
