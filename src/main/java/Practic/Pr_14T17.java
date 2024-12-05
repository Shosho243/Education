package Practic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pr_14T17 {
    public static void main(String[] args) {
        ////Реализуй метод, который поменяет ключи и значения в HashMap местами
        //1 way steam
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "A");
//        map.put(2, "B");
//        map.put(3, "C");
//        map.put(4, "D");
//        map.forEach((k, v) -> System.out.println(k + ":" + v));
//        Map<String, Integer> newMap = map.entrySet()
//                .stream()
//                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
//        newMap.forEach((k, v) -> System.out.println(k + ":" + v));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> temp : map.entrySet()) {
            Integer key = temp.getKey();
            String value = temp.getValue();
            newMap.put(value, key);

        }
        System.out.println(map);
        System.out.println(newMap);
    }
}



