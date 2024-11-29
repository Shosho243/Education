package Lesson10;

import java.util.Scanner;

public class ReadingDataFromTheConsole {
    //Считывание данных с консоли.
    public static void main(String[] args) {
        System.out.println("Введите первое число");

        int i = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        double j = new Scanner(System.in).nextDouble();

        System.out.println("Сумма чисел " + (i + j));
        System.out.println("Введите свое имя");

        String s = new Scanner(System.in).nextLine();
        char c = new Scanner(System.in).nextLine().charAt(0);
        System.out.println("Привет - " + s + c);



    }
}
