package Lesson53;

public class ArgFunction {
    public static void main(String[] args) {
        // Аргументы функции
        int a = 10 ;
        int b = 5 ;
        funPlus(a,b);
        funMinus(a,b);

        funUmnoj(a,b);

        funDelit(a,b);

    }

    private static void funMinus(int a, int b) {
        System.out.println(a-b);
    }

    private static void funPlus(int a, int b) {
        System.out.println(a+b);
    }
    private static void funUmnoj(int a, int b) {
        System.out.println(a*b);

    }
    private static void funDelit(int a, int b) {
        System.out.println(a/b);
    }
}
