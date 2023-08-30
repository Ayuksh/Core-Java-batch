package inhertanceProgram;

import java.util.Scanner;

public class MainApp11 {
    public static void main(String[] args) {
        main(10);
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOSE application ");
        System.out.println("1. myntra");
        System.out.println("2. ajio");
        int ch = sc.nextInt();
        if (ch == 1)
            new Myntra().sellProduct();
        else if(ch == 2)
            new AJIO().sellProduct();
        else
            main(args);

    }

    public static void main(int a)
    {
        System.out.println("main method !!");
    }
}
