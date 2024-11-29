package lesson95;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<Double, String> treeMap = new TreeMap<>();
        treeMap.put(5.1, "First");
        treeMap.put(2.0, "Second");
        treeMap.put(7.0, "Third");
        treeMap.put(6.0, "Fourth");
        treeMap.put(1.0, "Five");
        treeMap.put(4.0, "Six");
        treeMap.put(1.0, "Seven");
        treeMap.put(16.0, null);

        System.out.println(treeMap);
    }
}
