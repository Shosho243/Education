package lesson134;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Метод limit.
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        List<Integer> limitFilteredList = list1.stream().filter(x -> x > 4).limit(3).collect(Collectors.toList());
        System.out.println(limitFilteredList);

    }
}
