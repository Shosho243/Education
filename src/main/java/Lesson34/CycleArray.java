package Lesson34;

import java.util.Arrays;

public class CycleArray {
    public static void main(String[] args) {
        //Циклы и массивы.
        int[] array = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
//вручную
/*       for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " ");
       }
       Использование foreach
        for (int i1 : array) {
            System.out.print(i1 + " ");
        }*/
        //Обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+" ");
            
        }
    }
}

