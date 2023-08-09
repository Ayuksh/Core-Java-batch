package array;

public class Array2DExample {
    public static void main(String[] args) {
        int[][] arr ; // declaration
        arr = new int[3][3]; // size allocation

        arr[0][0] = 10 ;      arr[0][1] = 20 ;        arr[0][2] = 30 ;
        arr[1][0] = 40 ;      arr[1][1] = 50 ;        arr[1][2] = 60 ;
        arr[2][0] = 70 ;      arr[2][1] = 80 ;        arr[2][2] = 90 ;

        for(int i =0 ; i<3 ; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j]+"    ");
            System.out.println();
        }

        for (int[] a1 : arr)
        {
            for (int a : a1)
                System.out.print(a+"    ");
            System.out.println();
        }

    }
}
