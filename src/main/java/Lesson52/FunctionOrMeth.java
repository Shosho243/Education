package Lesson52;

public class FunctionOrMeth {
    public static void main(String[] args) {
        //Функции и методы.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = getSum(array);

        System.out.println("Сумма массива - " + sum);
    }

    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }
}

