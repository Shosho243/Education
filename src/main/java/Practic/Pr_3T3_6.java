package Practic;

import java.util.List;
import java.util.stream.Collectors;

public class Pr_3T3_6 {
    //Создать коллекцию целых чисел , написать программу:
    //Которая четные числа умножает на 100 , а от нечетных отнимает 100 и возвращает коллекцию.
    // Количество принимаемых и возвращаемых элементов коллекций должно сопадать 1, 2, 3, 4, 5, 6, 7, 8, 9
    public static void main(String[] args) {
//1 способ через тернальный оператор
//        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        System.out.println(transList(list));
//    }
//
//    public static List<Integer> transList(List<Integer> list) {
//        List<Integer> newList = list.stream()
//                .map(x -> x % 2 == 0 ? x * 100 : x - 100)
//                .collect(Collectors.toList());
//
//   return newList; }

        //2way
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(transList(list));

    }

    public static List<Integer> transList(List<Integer> list) {
        List<Integer> newList = list.stream()
                .map(x -> {
                    int result;
                    if (x % 2 == 0) {
                        result = x * 100;
                    } else {
                        result = x - 100;
                    }
                    return result;
                })
                .collect(Collectors.toList());
        return newList;
    }
}

