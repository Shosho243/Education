package Lesson63;

public class StackCall {
    public static void main(String[] args) {
        //Стек вызова через дебаг из одного метода вызываем другие методы

        int a = 20;
        int b = 10;
        calc(a, b);

    }

    private static void calc(int a, int b) {
        a = 30;
        b = 2;
        sum(a, b);
        div(a, b);
    }

    private static void sum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }

    private static void div(int a, int b) {
        System.out.println("div = " + (a / b));
    }
}
