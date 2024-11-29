package Lesson27;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Нахождение факториала
        // !5 1*2*3*4*5=120
        System.out.println("Введите число ");
        int i = new Scanner(System.in).nextInt();
        int x = 1;
        for (int j = 1; j <= i; j++) {
            x *= j;
            System.out.println("Факториал числа " + j + " " + x);
        }
        System.out.println("Факториал числа " + i + " " + x);
    }
}
