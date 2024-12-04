package Practic;

import java.util.List;
import java.util.stream.Stream;

public class Pr_6T8 {
    public static void main(String[] args) {
        //Найти сумму нечетных чисел в коллекции 1,2,3,4,5,11
        //1 спсоб
//        List<Integer> list1= List.of(1,2,3,4,5,11);
//        int result = list1.stream().filter(x->x%2!=0)
//                .reduce(Integer::sum)
//                .get();
//        System.out.println(result);

        // 2 способ
        List<Integer> list1= List.of(1,2,3,4,5,11);
        int result = list1.stream().filter(x->x%2!=0)
                .mapToInt(x->x)
                .sum();
        System.out.println(result) ;
    }
}
