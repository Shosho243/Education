package Zada4ki;

import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {
        //Найти сумму нечетных чисел в коллекции 1,2,3,4,5,11
        //1 спсоб
        int result = Stream.of(1, 2, 3, 4, 5, 11)
                .filter(x -> x % 2 != 0)
                .reduce(Integer::sum)
                .get();
        System.out.println(result);
        //2 способ
//        int result = Stream.of(1, 2, 3, 4, 5, 11)
//                .filter(x -> x % 2 != 0)
//                .mapToInt(x->x).sum();
//

    }
}
