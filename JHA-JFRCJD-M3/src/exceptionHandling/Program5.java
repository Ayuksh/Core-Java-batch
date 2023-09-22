package exceptionHandling;

import java.net.MalformedURLException;
import java.net.URL;

public class Program5 {
    public static void main(String[] args) {

        URL u1= null ;
           try {
               u1 = new URL("hts://ww.gole.com/");
               System.out.println( u1.getHost() );
               System.out.println(u1.getPort());
               System.out.println(u1.getProtocol());
           }catch (MalformedURLException u)
           {
               System.out.println(u);
           }


    }
}
