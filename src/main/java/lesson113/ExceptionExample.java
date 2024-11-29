package lesson113;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExample {
    public static void main(String[] args) {
        //Исключения. Exception. finally.
        System.out.println("Start program");
        System.out.println(method());
        System.out.println("End program");
    }

    private static int method() {
        File file = new File("test1.txt");
        try {
            FileInputStream fis= new FileInputStream(file);
            return 1;
        } catch (FileNotFoundException e) {
            System.out.println("Block catch");
            return 2;
        }finally {
            System.out.println("Block finally");
        }
    }
}
