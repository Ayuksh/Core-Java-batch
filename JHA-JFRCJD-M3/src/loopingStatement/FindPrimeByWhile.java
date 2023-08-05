package loopingStatement;

public class FindPrimeByWhile {
    public static void main(String[] args) {
        int countPrime = 0 ;
        int j = 1;

        while(countPrime != 7)
        {
            int m = j ;
            int count = 0 ;
            for (int i =1 ; i <= m ; i++)
                if (m %i ==0)
                    count++;
            if (count==2)
            {
                System.out.println(m);
                countPrime++;
            }
            j++;

        }
    }
}
