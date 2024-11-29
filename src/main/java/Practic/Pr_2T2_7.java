package Practic;

import java.util.List;
import java.util.stream.Collectors;

public class Pr_2T2_7 {
    public static void main(String[] args) {
        //Создать коллекцию целых чисел . Написать программу
        // Который отрицательные числа делает положительными и возвращает коллекцию
        // ([1,5,-3,7] ->[1,5,3,7])
        List<Integer> list1 = List.of(1,5,-3,7);
        System.out.println(transform(list1));
    }
    public static List<Integer> transform(List<Integer> intrans){
        List<Integer> transform = intrans
                .stream()
                .map(Math::abs)
                .collect(Collectors.toList());
        return transform;
    }
}
