package Zada4ki;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task17 {
    public static void main(String[] args) {
        //Реализуй метод, который поменяет ключи и значения в HashMap местами
        //1 cпособ стримами
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(1, "A");
//        map.put(2, "B");
//        map.put(3, "K");
//        map.put(4, "L");
//        map.forEach((k, v) -> System.out.println(k + ":" + v));
//
//        Map<String, Integer> mapNew = map.entrySet()
//                .stream()
//                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
//
//        mapNew.forEach((k, v) -> System.out.println(k + ":" + v));


        //2 способ без стримов
//        HashMap<Integer, String> first = new HashMap<>();
//        first.put(1, "A");
//        first.put(2, "B");
//        first.put(3, "K");
//        first.put(4, "L");
//
//        Map<String, Integer> newMap = new HashMap<>();
//        for (Map.Entry<Integer, String> n : first.entrySet()) {
//            newMap.put(n.getValue(), n.getKey());
//
//        }
//        System.out.println(first);
//        System.out.println(newMap);


        //3 способ обведите 2 переменные по ключу и значению
        HashMap<Integer, String> first = new HashMap<>();
        first.put(1, "A");
        first.put(2, "B");
        first.put(3, "K");
        first.put(4, "L");

        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> n : first.entrySet()) {
           Integer key = n.getKey();
           String value = n.getValue();
            newMap.put(value, key);

        }
        System.out.println(first);
        System.out.println(newMap);
    }
}
