package array;

public class OddEvenSum {
    public static void main(String[] args) {
        int[] arr = {2, 4 , 8 , 3 , 7 , 5 , 6 , 1 };
        int evenSum =0 , oddSum = 0 ;
        for (int i =0 ; i< arr.length ; i++)
        {
            if(arr[i]%2==0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("SUM OF EVEN NUMBER IS "+ evenSum);
        System.out.println("SUM OF ODD SUM IS "+ oddSum);
    }
}
