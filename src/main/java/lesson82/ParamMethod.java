package lesson82;

public class ParamMethod {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        String[] array2 = {"a", "b", "c"};
        show(array1);
        System.out.println("");
        show(array2);
        Double[] array3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("");
        show(array3);

    }

    private static <T> void show(T[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }
    }
}

//    private static void show(String[] array1) {
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//        }
//    }
//}