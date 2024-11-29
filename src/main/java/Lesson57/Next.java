package Lesson57;

import java.util.Scanner;

public class Next {
    public static void main(String[] args) {
        System.out.println("Введите А");

        String a = new Scanner(System.in).next();
        System.out.println("Считываение до пробела А - " + a);
        System.out.println("Введите Б");
        String b = new Scanner(System.in).nextLine();
        System.out.println("Считование до ентора B- " + b);
    }
}
