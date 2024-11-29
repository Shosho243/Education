package Lesson37;

public class SumArray {
    public static void main(String[] args) {
        //Как найти сумму элементов массива.
        int[] arrayX = {1331, 12, 54, 84, 1, 2, 3, 4, -887, 74, 3, -5, 6, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //              0     1   2   3  4   5  6 7   8    9  10 11 12 13 14 15 16 17 18 19 20 21 22 23
        int summa = 0;
        for (int i = 0; i < arrayX.length; i++) {
            summa += arrayX[i];
            System.out.println("i - "+ i+ " summa - " + summa);
        }
        System.out.println("Сумма - " + summa);
    }
}
