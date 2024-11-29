package Lesson68;

public class Time {
    public static void main(String[] args) {
        //Как посчитать время выполнения программы.
        long a = 10;
        long b = 15;
        long c = 20;
        long time = System.currentTimeMillis();
 //      System.out.println(time);

        for (int i = 0; i < 1500000; i++) {
            a++;

            b += 5;

            c += a + b;
        }
        time = System.currentTimeMillis()-time;
        System.out.println(time);

        System.out.println(c);
    }
}
