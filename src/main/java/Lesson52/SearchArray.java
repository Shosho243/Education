package Lesson52;

public class SearchArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = search(array);
        System.out.println("Найден элемент 9 под индексом - " + x);
        int max = searchMaxArray(array);
        System.out.println("Найден макс элемент  - "+max);


    }

    public static int search(int[] array) {
        int x = 9;
        int xIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                xIndex = i;

            }

        }
        return xIndex;
    }

    public static int searchMaxArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }
}



