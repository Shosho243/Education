package Lesson17;

import java.util.Scanner;

public class Ternary_operator {
    // Тернарный оператор
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<=b");
        }
        System.out.println(a > b ? "a>b" : "a<=b");
    }
}
