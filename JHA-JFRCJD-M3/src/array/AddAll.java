package array;

public class AddAll {
    public static void main(String[] args) {
        double[] list1 = {20.34 , 30.45 , 99.99 , 30.67 , 20.34 };

        double sum = 0.0 ;
        for (int i =0 ; i< list1.length ; i++ )
              sum += list1[i];

        System.out.println(sum);


    }
}
