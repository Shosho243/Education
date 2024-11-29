package lesson70;

public class Recursion {
    public static void main(String[] args) {
        // Рекурсия , когда метод ввызывает сам себя при этом должно быть условие , чтоб выйти из цикла .
        // Обязательно смотреть , чтоб услловие ввыполнилось
        int a = 100;
        System.out.println(method1(a));
    }

    private static int method1(int a) {
        if (a==500){
            return a;
        }
        a = a + 50;
        return method1(a);
    }

    private static int method2(int a) {
        a = a + 25;
        return a;
    }
}