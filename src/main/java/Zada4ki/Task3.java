package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;



public class Task3 {
    //Создать коллекцию целых чисел , написать программу:
    //Которая четные числа умножает на 100 , а от нечетных отнимает 100 и возвращает коллекцию.
    // Количество принимаемых и возвращаемых элементов коллекций должно сопадать 1, 2, 11, 14)
    public static void main(String[] args) {
        //1 способ через тернальный оператор
        //       List<Integer> list2 = list1.stream().map(x->x%2==0 ? x*100:x-100).collect(Collectors.toList());
//       System.out.println(list2);

        //2 способ if else
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(multiList(list1));
    }

    public static List<Integer> multiList(List<Integer> list) {
        List<Integer> newList = list.stream().map(x -> {
            int result;
            if (x % 2 == 0) {
                return x * 100;
            }else {
                return x -100;
            }
        }).collect(Collectors.toList());
        return newList;
    }
}
