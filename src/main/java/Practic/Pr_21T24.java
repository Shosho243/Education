package Practic;

import java.util.Scanner;

public class Pr_21T24 {
    public static void main(String[] args) {
        ////Факториал 5! используем метод и сканер: 1*2*3*4*5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber = scanner.nextInt();
        scanner.close();
        long result;
        if (inputNumber < 0) {
            System.out.println("Введенное число неверно");
        } else {
            result = factorial(inputNumber);
            System.out.println("Факториал дня " + inputNumber + " = " + result);
        }

    }

    public static long factorial(int inputNumber) {
        long result = 1;
        for (int i = 1; i < inputNumber; i++) {
            result *= i;
        }

        return result;
    }
}
