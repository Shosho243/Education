package Zada4ki;

import java.util.HashMap;
import java.util.HashSet;

public class Task12 {
    public static void main(String[] args) {
        //Уникальный элемент из списка int
        int[] array = {1, 2, 2, 3, 5, 2};
        System.out.println(distinctNum(array));
    }

    public static HashSet<Integer> distinctNum(int[] dNum) {
        HashSet<Integer> distinct = new HashSet<>();
        for (int i : dNum) {
            distinct.add(i);
        }
        return distinct;
    }
}
