package lesson137;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Метод parallelStresm.
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(48);
        list1.add(15);
        list1.add(33);
        list1.add(87);

        int sum = list1.stream().reduce((a,x) -> a + x).get();
        System.out.println(sum);

    }
}
