package Practic;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Pr_5T5 {
    public static void main(String[] args) {
        //8,99,2,4,6,5,16
        //найти самое минимальное число с помощью стрима
        //1 способ
//        Stream<Integer> numbers = Stream.of(8, 99, 2, 4, 6, 5, 16,-2);
//        int result = numbers
//                .min(Integer::compare)
//                .get();
//        System.out.println(result);


        //2 way
        Supplier<Stream<Integer>> numbers=()-> Stream.of(8,99,2,4,6,5,16);
        Optional<Integer> min =numbers.
                get().min(Comparator.naturalOrder());
        Optional<Integer> max= numbers
                .get().max(Comparator.naturalOrder());
        System.out.println(min.get());
        System.out.println(max.get());



    }
}
