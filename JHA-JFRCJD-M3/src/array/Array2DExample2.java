package array;

import java.util.Scanner;

public class Array2DExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];
        System.out.println("ENTER VALUES INSIDE ARRAY ");
        for(int i = 0 ; i<2 ; i++)
        {
            for (int j =0 ; j<3 ; j++)
                arr[i][j] = sc.nextInt();
        }

        System.out.println("--------------------------------");
        for (int[] a1 : arr) {
            for (int a : a1)
                System.out.print(a+"     ");
            System.out.println();
        }
    }
}
