package Practic;

public class Pr_8T10 {
    public static void main(String[] args) {
        //Найти минимальное значение из массива при положительных значениях 46, 67, 78, 97, 100
        int[] array = {46, 67, 78, 97, 100};
        System.out.println(minNumb(array));
    }

    public static int minNumb(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


