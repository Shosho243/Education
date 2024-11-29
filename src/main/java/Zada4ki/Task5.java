package Zada4ki;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        //8,99,2,4,6,5,16
        //найти самое минимальное число с помощью стрима
//        Stream<Integer> number = Stream.of(8,99,2,4,6,5,16);
//        int resilt = number.min(Integer::compare).get();
//        System.out.println(resilt);

        Supplier<Stream<Integer>> result = () -> Stream.of(8, 99, 2, 4, 6, 5, 16);
        Optional<Integer> min = result.get().min(Comparator.naturalOrder());
        Optional<Integer> max = result.get().max(Comparator.naturalOrder());

        System.out.println(min.get());
        System.out.println(max);
    }
}
