package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    //Создать коллекцию целых чисел . Написать программу
    // Который отрицательные числа делает положительными и возвращает коллекцию
    // ([1,5,-3,7] ->[1,5,3,7])
    public static void main(String[] args) {
    List<Integer> list1 = List.of(1,5,-3,7);

    System.out.println(transform(list1));

    }
    public static List<Integer> transform(List<Integer> integerList) {
        List<Integer> transform = integerList.stream().map(Math::abs).collect(Collectors.toList());
    return transform;}
}
