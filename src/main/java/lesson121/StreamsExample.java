package lesson121;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //Streams. Метод map.
        List<String> list1 = new ArrayList<String>();
        list1.add("Element 1");
        list1.add("Elem 2");
        list1.add("Ele3");
        list1.add("Number4");

//        for (int i = 0; i <list1.size() ; i++) {
//            list1.set(i,String.valueOf(list1.get(i).length()));
//
//            System.out.println(list1);
        List<Integer> list2 =list1.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

    }
}

