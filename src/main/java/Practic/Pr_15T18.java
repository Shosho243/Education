package Practic;

import java.util.List;
import java.util.Map;

public class Pr_15T18 {
    public static void main(String[] args) {
        //Посчитать сумма ключей и значений в HashMap
        var map = Map.of(
                1, List.of(1, 2, 3, 4, 5),
                2, List.of(1, 2, 3, 4, 5)
        );
        var sum = map.entrySet()
                .stream()
                .mapToInt(temp -> temp.getKey() + temp.getValue()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum())
                .sum();
        System.out.println(sum);
    }
}
