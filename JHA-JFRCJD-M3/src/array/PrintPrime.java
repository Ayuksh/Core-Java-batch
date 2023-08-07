package array;

public class PrintPrime {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 };

        for (int a : arr)
        {
            int factorCount =0 ;
            for (int i=1 ; i<=a ; i++)
                if (a%i == 0)
                    factorCount++;
            if (factorCount==2)
                System.out.println(a);
        }
    }
}
