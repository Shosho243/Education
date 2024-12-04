package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    //Создать коллекцию целых чисел . Написать программу
    // Который отрицательные числа делает положительными и возвращает коллекцию
    // ([1,5,-3,7] ->[1,5,3,7])
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 5, -3, 7);
        System.out.println(transfer(number));
    }

    public static List<Integer> transfer(List<Integer> number) {
        List<Integer> result = number.stream().map(Math::abs).collect(Collectors.toList());
        return result;
    }
}
