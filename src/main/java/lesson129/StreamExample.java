package lesson129;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Метод distinct.
        Stream<String> st1 = Stream.of("A","B","C");
        Stream<String> st2= Stream.of("E","D","F");
        Stream<String> st3 = Stream.concat(st1,st2);
        Stream<String> st4 = Stream.of("A","B","C","D","E","F","A","B","C");
        st4.distinct().forEach(System.out::print);

    }
}
