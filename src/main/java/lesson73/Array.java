package lesson73;

public class Array {
    public static void main(String[] args) {
        // Многомерные массивы
        int[][] myArray = {
                           {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}
        };
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j]);

            }
            System.out.println();
        }

    }
}
