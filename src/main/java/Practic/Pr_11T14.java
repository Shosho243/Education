package Practic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr_11T14 {
    public static void main(String[] args) {
        //число армстронга
        //153 = 1/3 + 3/3 + 5/3 = 1+27+ 125    /-степень . Нужно написать программу
        int number = 153;
        int y = 0, x, temp;
        temp = number;
        while (temp > 0) {
            x = temp % 10;
            temp = temp / 10;
            y = y + (x * x * x);
        }
        if (y == number) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
    }
}


