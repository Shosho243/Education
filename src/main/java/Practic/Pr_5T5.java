package Practic;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Pr_5T5 {
    public static void main(String[] args) {
        //8,99,2,4,6,5,16
        //найти самое минимальное число с помощью стрима
//        Stream<Integer> number = Stream.of(8, 99, 2, 4, 6, 5, 16);
//int result = number.min(Integer::compare).get();
//System.out.println(result);

        Supplier<Stream<Integer>> number =()-> Stream.of(8,99,2,4,6,5,16);
        Optional min =number.get().min(Comparator.naturalOrder());
        Optional max =number.get().max(Comparator.naturalOrder());
        System.out.println(min);
        System.out.println(max);
    }
}
