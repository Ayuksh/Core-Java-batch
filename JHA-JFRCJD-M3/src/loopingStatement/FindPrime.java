package loopingStatement;

public class FindPrime {
    public static void main(String[] args) {

            for (int j = 1 ; j<=10000 ; j++)
            {
                int m = j ;
                int count =0 ;
                for (int i = 1 ; i<=m ; i++)
                    if (m%i ==0 )
                        count++;

                if (count == 2)
                    System.out.println(m);
            }


    }
}
