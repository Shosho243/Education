package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        //Создать коллекцию целых чисел, написать программу
        //Которая четные числа умножает на 100 , а от нечетных оитнимает 100 и возвращает коллекцию
        //Количество принимаемых и вохвращаемых элементов коллекций должно совпадать
        List<Integer> initialList = List.of(76, 99, 54, 7, 3);
        System.out.println(multiList(initialList));

    }

    public static List<Integer> multiList(List<Integer> initialList) {
        List<Integer> resultList = initialList.stream().map(x -> x % 2 ==0? x*100:x-100).collect(Collectors.toList());
        return resultList;
    }
}
