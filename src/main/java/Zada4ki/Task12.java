package Zada4ki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task12 {
    public static void main(String[] args) {
        //Уникальный элемент из списка int. Удалить дубликаты из сортированного списка
        int[] array = {1, 2, 2, 3, 5, 2};
        System.out.println(distinctNum(array));
    }

    public static Set<Integer> distinctNum(int[] dNum) {
        Set<Integer> distinct = new HashSet<>();
        for (int i : dNum) {
            distinct.add(i);
        }
        return distinct;
    }
}
