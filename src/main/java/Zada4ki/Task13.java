package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        //Уникальный элемент списка 1,2,2,5,4,2
        List<Integer> num = List.of(1,2,2,5,4,2)
                .stream().distinct().collect(Collectors.toList());
        System.out.println(num);
    }
}
