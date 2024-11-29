package Practic;

import java.util.stream.Stream;

public class Pr_6T8 {
    public static void main(String[] args) {
        //Найти сумму нечетных чисел в коллекции 1,2,3,4,5,11
        //1 спсоб
//        int result = Stream.of(1, 2, 3, 4, 5, 11)
//                .filter(x -> x % 2 != 0)
//                .reduce(Integer::sum)
//                .get(); //для обработки исключения вместо .get() написать orElseThrow(RuntimeException::new);
//        System.out.println(result);
        int result = Stream.of(1,2,3,4,5,11)
                .filter(x->x%2!=0)
                .mapToInt(x->x).sum();// Вместо лямбды можно использовать в mapToInt(Integer::intValue)
        System.out.println(result);
    }
}
