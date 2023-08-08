package array;

import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY ");
        int n = sc.nextInt();
        int[] arr = new int[ n ] ;

        for (int i =0 ; i < n ; i++)
        {
            System.out.println("ENTER INT VALUE ");
            int s = sc.nextInt();
                arr[i] = s ;
        }

        System.out.println("----------------------");
        int sum =0 ;
        for (int s : arr)
            sum += s ;

        System.out.println("SUM IS "+ sum);

    }
}
