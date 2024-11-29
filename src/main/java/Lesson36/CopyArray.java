package Lesson36;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //Копирование массива.
        int[] arrayX = {1331, 12, 54, 84, 1, 2, 3, 4, 887, 74, 3, 5, 6, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //              0     1   2   3  4   5  6 7   8    9  10 11 12 13 14 15 16 17 18 19 20 21 22 23

        int[] arrayY = new int[arrayX.length];
        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(arrayY));
//     Можно так копировать , но это костыли , есть специальный метод
//        for (int i = 0; i < arrayX.length; i++) {
//            arrayY[i] = arrayX[i];
//        }
//
//
        System.out.println("-------------------------------------------------");
System.arraycopy(arrayX,0,arrayY,0,arrayX.length);

        System.out.println(Arrays.toString(arrayX));
        System.out.println(Arrays.toString(arrayY));
    }
}
