package loopingStatement;

public class Program4 {
    public static void main(String[] args) {
        int m = 1 ;
        int count = 0 ;
        for (int i =1 ; i <= m ; i++)
        {
            if ( m %i == 0) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 2 )
            System.out.println("IT IS A PRIME NUMBER !!");
    }
}
