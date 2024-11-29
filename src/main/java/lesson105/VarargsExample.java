package lesson105;

public class VarargsExample {
    public static void main(String[] args) {
        //varargs можем прописывать ... и можем ввести любое кол-во аргументов
        System.out.println(summa("HI",5, 5));
        System.out.println(summa("HI",5, 6, 7));
        int[] array = {1,5,7,6,9,3,2,12};
        System.out.println(summa("HI" , array));
    }

    private static int summa(String str ,int... a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
//    }
//    private static int summa(int a, int b) {
//        return a+b;
//    }private static int summa(int a, int b, int c) {
//        return a+b+c;
//    }
    }
}