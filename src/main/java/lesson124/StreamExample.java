package lesson124;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Arrays.stream(array).forEach(element -> System.out.print(element*2 + " "));
        Arrays.stream(array).forEach( System.out::print);
    }
}
