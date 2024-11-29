package Lesson40;

import java.util.Arrays;

public class MirrorArray {
    public static void main(String[] args) {
        //Зеркальное отражение массива
        int[] array = {1331, 12, 54, 84, 1, 2, 3, 4, -887, 74, 3, -5, 6, 9, 1, 2, 3, 4, 55555, 2, 2, 6, 7, 8, 9, 10};
        //              0     1   2   3   4  5  6  7   8    9   10  11 12 13 14 15 16 17 18    19 20 21 22 23,24,25
        //temp= 2
        //
        //

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1-i ] = temp;
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }

}



