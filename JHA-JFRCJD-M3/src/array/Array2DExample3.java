package array;

public class Array2DExample3 {
    public static void main(String[] args) {
        int[][] arr = {
                {10 , 20 , 30 },
                {20 , 30 , 40 , 50 , 60 },
                {10 , 40 , 50 , 20 },
        };

        int sum =0 ;
        for (int i =0 ; i< arr.length ; i++ )
        {

            for (int j =0 ; j < arr[i].length ; j++ )
                sum += arr[i][j];
            System.out.println(sum);
        }
    }
}
