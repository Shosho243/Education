package Lesson39;

public class ArrayOften {
    public static void main(String[] args) {
        //Частота элемента в массиве
        int[] array = {1331, 12, 54, 84, 1, 2, 3, 4, -887, 74, 3, -5, 6, 9, 1, 2, 3, 4, 55555, 2, 2, 6, 7, 8, 9, 10};
        //              0     1   2   3   4  5  6  7   8    9   10  11 12 13 14 15 16 17 18    19 20 21 22 23,24,25

        int x = 2;
        int result = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                result++;
            }


        }
        System.out.println("Цифра " + x + " встречается столько " + result + " раз");

    }
}
