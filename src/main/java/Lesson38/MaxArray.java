package Lesson38;

public class MaxArray {
    public static void main(String[] args) {
        //Поиск максимального элемента в массиве
        int[] arrayX = {1331, 12, 54, 84, 1, 2, 3, 4, -887, 74, 3, -5, 6, 9, 1, 2, 3, 4, 55555, 6, 7, 8, 9, 10};
        //              0     1   2   3   4  5  6  7   8    9   10  11 12 13 14 15 16 17 18     19 20 21 22  23
        int max = arrayX[0];
        int xIndex = 0;
        for (int i = 1; i < arrayX.length; i++) {
            if (arrayX[i] > max) {
                max = arrayX[i];
            }

        }
        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i] == max) {
                xIndex = i;
            }


        }
        System.out.println("Максимальное число в массиве - " + max);
        System.out.println("Индекс макс числа - " + xIndex);

        int min = arrayX[1];
        //Поиск минимального элемента в массиве
        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i] < min) {
                min = arrayX[i];
            }

        }
        int yIndex = 0;
        for (int i = 0; i < arrayX.length; i++) {

        }
        for (int i = 0; i < arrayX.length; i++) {
            if (arrayX[i] == min) {
                yIndex = i;
            }

        }
        System.out.println("Минимальное число в массиве - " + min);
        System.out.println("Индекс мин числа - " + yIndex);
    }
}
