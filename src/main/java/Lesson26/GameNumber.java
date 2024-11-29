package Lesson26;

import java.util.Random;
import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
        //загадываем рандомное число и угадываем
        int x = new Random().nextInt(11);
        int y;
        while (true) {

            System.out.println("Введите число от 0 до 10");
            y = new Scanner(System.in).nextInt();

            if (x == y) {
                System.out.println("Ура вы угалали число" + x);
                break;
            } else if (y > x) {
                System.out.println("Загаданое число меньше" + y);
            } else System.out.println("Занаданное число больше" + y);
        }
    }
}