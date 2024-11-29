package lesson130;

import java.util.stream.Stream;

public class StreamExample {
    // Streams. Метод count.
    public static void main(String[] args) {
        Stream<String> st4 = Stream.of("A","B","C","D","E","F","A","B","C");
        System.out.println(st4.distinct().count());
    }
}
