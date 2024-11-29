package lesson128;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Метод concat.
        Stream<String> st1 = Stream.of("A","B","C");
        Stream<String> st2= Stream.of("E","D","F");
        Stream<String> st3 = Stream.concat(st1,st2);
        st3.forEach(System.out::println);

    }
}
