package Lesson54;

public class ReturnFunction {
    public static void main(String[] args) {
        //Возвращаем результат функции. Return.
        int a = 10;
        int b = 5;
        int result;

        result=funPluS(a, b);
        System.out.println(result);
    }

    public static int funPluS(int x, int y) {
        int c= x*x+4*x*y*+150;
        return c;

    }
}
