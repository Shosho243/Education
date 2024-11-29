package Lesson31;

import java.util.Arrays;

public class ArrayConsole {
    public static void main(String[] args) {
        //Вывод массивов на консоль.
        int[] array = {1,3,5,6,12,456,76};
        String [] stringArray = {"string 1", "test text", "sdfdsfsd", "123"};
        boolean [] booleansArray = {true,false,true,true,false};

        int [] array2 = new int[10];
        String[] stringArray2 = new String[10];
        int[] array3 = {};
        String[] stringArray3 = {};


        System.out.println(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(stringArray2));
        System.out.println(Arrays.toString(stringArray3));

    }
}
