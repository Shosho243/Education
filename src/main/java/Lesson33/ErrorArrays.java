package Lesson33;

import java.util.Arrays;

public class ErrorArrays {
    public static void main(String[] args) {
        //Ошибка при работа с массивом

        int[] array ={0,1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[4]);

        System.out.println(array[5]);
    }
}
