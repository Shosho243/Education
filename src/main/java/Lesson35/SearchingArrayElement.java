package Lesson35;

public class SearchingArrayElement {
    public static void main(String[] args) {
        //Поиск элемента в массиве. Ищем эллемент 84
        int[] array = {1331, 12, 54, 84, 1, 2, 3, 4, 887, 74, 3, 5, 6, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //              0     1   2   3  4   5  6 7   8    9  10 11 12 13 14 15 16 17 18 19 20 21 22 23
        int x = 84;
        int xIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] ==x){
                xIndex = i;
                break;


            }
            System.out.println(i);

        }System.out.print("xIndex - " + xIndex);
    }
}
