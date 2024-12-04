package Practic;

import java.util.HashSet;
import java.util.Set;

public class Pr_10T12_13 {
    public static void main(String[] args) {
        ////Уникальный элемент из списка int 1, 2, 2, 3, 5, 2
        //1 способ
//        List<Integer> list = List.of(1, 2, 2, 3, 5, 2);
//        List<Integer> newList = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.print(newList);

        int[] array = {1, 2, 2, 3, 5, 2};
        System.out.println(distinctNum(array));
    }

    public static Set<Integer> distinctNum(int[] array) {
        Set<Integer> newList = new HashSet<>();
        for (int temp : array) {
            newList.add(temp);
        }
        return newList;
    }
}

