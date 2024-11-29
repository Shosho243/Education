package Lesson13;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        //Консольный калькулятор простой
        System.out.println("Введите первое число");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("Введите второе число");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Сложение " + (a + b));
        System.out.println("Вычитание " + (a - b));
        System.out.println("Умножения " + (a * b));
        System.out.println("Деление" + (a / b));


    }
}
