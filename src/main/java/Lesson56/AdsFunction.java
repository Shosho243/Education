package Lesson56;

public class AdsFunction {
    public static void main(String[] args) {
        //Объявление и вызов функции
        int a = 10;
        int b = 10;
        int result = funPlus(a, b);
        System.out.println(result);

    }

    private static int funPlus(int x, int y) {
        return x + y;
    }

    private static int funMinus(int x, int y) {
        return x - y;
    }

    public static int funUmnoj(int x, int y) {
        return x * y;
    }

    public static int fundelit(int x, int y) {
        return x / y;
    }
}



