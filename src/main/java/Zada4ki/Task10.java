package Zada4ki;

public class Task10 {
    public static void main(String[] args) {
        //Найти минимальное значение из массива при положительных значениях 46, 67, 78, 97, 100

        int[] array = {46, 67, 78, 97, 100};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}
