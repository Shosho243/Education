package Lesson23;

public class SumWhile {
    public static void main(String[] args) {
        //Как найти сумму чисел от 1 до 100 через цикл
        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
