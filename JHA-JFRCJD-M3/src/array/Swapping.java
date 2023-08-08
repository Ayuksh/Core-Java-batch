package array;

import java.util.Arrays;

public class Swapping {
    public static void main(String[] args) {
        int[] arr = {0 ,1 , 1 , 0 , 0 , 1 , 0 , 1};
        int m = 0 ;
        for (int i =0 ; i< arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp ;
                m++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
