package Zada4ki;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task18 {
    public static void main(String[] args) {
        //Посчитать сумма ключей и значений в HashMap



        var map = Map.of(
                1, List.of(1, 2, 3, 4, 5),
                2, List.of(1, 2, 3, 4, 5)
        );

        var sum = map.entrySet()
                .stream()
                .mapToInt(entry -> entry.getKey() + entry.getValue().stream()
                        .mapToInt(Integer::intValue)
                        .sum())
        .sum();
        System.out.println(sum);
    }
}
