package exceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {
    public static void main(String[] args) {
        String path = "C://Users//admin//Desktop//Demo.txt/";
        File file = new File(path);
        try {
            boolean status = file.createNewFile();
            if (status)
                System.out.println("FILE CREATED ");
            else
                System.out.println("FILE NOT CREATED ");
        }catch (IOException e)
        {
            System.out.println(e);
        }

        try {
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            fileWriter.write("this is file ");
            fileWriter.close();
            System.out.println("FILE UPDATED ");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
