package Lesson61;

public class OverloadFunction {
    public static void main(String[] args) {
        //Перегрузка функций
        int a = 8;
        int b = 4;
        int e =1;
        double c = 10.5;
        double d = 3.5;
        System.out.println(divide(a, b));
        System.out.println(divide(c, d));
        System.out.println(divide(a, b,e));
    }

    private static int divide(int first, int second) {
        return first / second;
    }
    private static int divide(int first, int second, int third){
        return first/second/third;
    }

    private static double divide(double first, double second) {
        return first / second;
    }
}
