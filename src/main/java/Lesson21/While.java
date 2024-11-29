package Lesson21;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // Цикл WHILE
        System.out.println("Введите число меньше 50");
        int a = new Scanner(System.in).nextInt();

        while (a < 50) {
            if (a % 2 == 0) {
                System.out.println(a);

            }

            a++;

        }
    }
}
