package Lesson22;

import Lesson21.While;

import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {
        // Цикл DO WHILE
        int a = new Scanner(System.in).nextInt();
        do {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
        while (a <= 50);

    }
}
