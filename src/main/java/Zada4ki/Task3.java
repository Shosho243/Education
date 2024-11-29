package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    //Создать коллекцию целых чисел , написать программу:
    //Которая четные числа умножает на 100 , а от нечетных отнимает 100 и возвращает коллекцию.
    // Количество принимаемых и возвращаемых элементов коллекций должно сопадать
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 11, 14);
        System.out.println(list1);
//       1 способ
//       List<Integer> list2 = list1.stream().map(x->x%2==0 ? x*100:x-100).collect(Collectors.toList());
//       System.out.println(list2);
        //2 cспособ
        List<Integer> list2 = list1.stream().map(n -> {
            int result;
            if (n % 2 == 0) {
                result = n * 100;
            } else {
                result = n - 100;
            }
            return result;
        }).collect(Collectors.toList());
        System.out.println(list2);
    }
}
