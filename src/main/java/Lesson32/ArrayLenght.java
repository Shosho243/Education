package Lesson32;

import java.util.Arrays;

public class ArrayLenght {
    public static void main(String[] args) {
        //Элементы массива, индексы и длина массива
        int[] arrays = {13, 2, 31, 27, 5, 6, 8,13, 2, 31, 27, 5, 6, 8,13, 2, 31, 27, 5, 6, 999};
        System.out.println(Arrays.toString(arrays));

        System.out.println(arrays[0]);
        System.out.println(arrays[6]);

        System.out.println(arrays.length);
        System.out.println(arrays[20]);
        System.out.println(arrays[arrays.length-1]);
    }
}
