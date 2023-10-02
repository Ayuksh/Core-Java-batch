package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Sample {
    public static void master() throws IOException
    {
        System.out.println("MASTER METHOD START");
        throw new IOException();
    }

    public static void central() throws IOException
    {
        System.out.println("CENTRAL METHOD START");
        master();
        System.out.println("CENTRAL METHOD END ");
    }

    public static void main(String[] args) throws IOException {
        System.out.println("MAIN METHOD START");
       central();
        System.out.println("MAIN METHOD END ");
    }

}
