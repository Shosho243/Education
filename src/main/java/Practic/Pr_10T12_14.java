package Practic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr_10T12_14 {
    public static void main(String[] args) {
        ////Уникальный элемент из списка int 1, 2, 2, 3, 5, 2
//        int[] sortedList = {1, 2, 2, 3, 5, 2};
//        System.out.println(distincNum(sortedList));
//
//    }
//    public static Set<Integer> distincNum(int[] array){
//        Set<Integer> distinct = new HashSet<>();
//        for(int i:array){
//            distinct.add(i);
//
//        }
//return distinct;


        //2 способ через стреам
        List<Integer> list1 = Stream.of(1, 2, 2, 5, 4, 2)
                .distinct().collect(Collectors.toList());
        System.out.println(list1);
    }
}

