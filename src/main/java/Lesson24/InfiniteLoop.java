package Lesson24;

public class InfiniteLoop {
    public static void main(String[] args) {
        //Бесконечный цикл FOR
        int i = 0;
        for (;;)
            System.out.println("Hello World"+i++);
    }
}
