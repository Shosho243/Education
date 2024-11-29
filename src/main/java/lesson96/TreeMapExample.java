package lesson96;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //TreeMap. Методы descendingMap, tailMap, headMap, lastEntry, firstEntry.
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
        System.out.println(treeMap.get(2.0));
        System.out.println(treeMap);
        System.out.println(treeMap.remove(2.0));
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());//Убывание кей
        System.out.println(treeMap.headMap(5.1));// начала до элемента не входит
        System.out.println(treeMap.tailMap(5.1));// хвост от до входит
        System.out.println(treeMap.firstEntry());// первое
        System.out.println(treeMap.lastEntry());// последнее

    }
}
