package lesson121;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("ВЫВА");
        list1.add("Выфвфывм");
        list1.add("ВЫ");
        list1.add("ВЫВА6556778");
        list1.add("В");

        List<Integer> list2 = list1.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println(list2);

    }
}
