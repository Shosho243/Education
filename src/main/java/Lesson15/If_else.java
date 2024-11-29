package Lesson15;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        // IF, ELSE операция условного перехода
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();

        if (a > b) {
            System.out.println("Выполняется проверка a>b ");
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("Выполняется проверка a<b ");
            System.out.println("a<b");
        } else {
            System.out.println("a=b");
        }
    }
}
