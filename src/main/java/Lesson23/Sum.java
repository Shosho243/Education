package Lesson23;

public class Sum {
    public static void main(String[] args) {
        //как найти сумму от 1 до 100
        int min = 1;
        int max = 100;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println("сумма "+sum);
    }
}
