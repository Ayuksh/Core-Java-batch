package array;

public class Array2DExample4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 12 , 23 , 40 , 14 , 15 , 10 },
                { 9 , 7 , 6 , 14 , 20 },
                { 34 , 56 , 12 },
                { 34 , 23 , 9 , 10 }
        };

        int maxSum = 0 ;
        int maxSumArr = 0 ;

        for(int i =0 ; i<arr.length ; i++)
        {
            int sum =0 ;
            for (int j =0 ; j<arr[i].length ; j++)
                sum += arr[i][j];

            if (sum > maxSum) {
                maxSum = sum;
                maxSumArr = i ;
            }
        }
        System.out.println("MAX SUM IS : "+ maxSum);
        System.out.println("THE ARRAY IS ");
        for(int k =0 ; k<arr[maxSumArr].length ; k++)
            System.out.print(arr[maxSumArr][k]+"     ");
    }
}
