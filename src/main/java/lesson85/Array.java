package lesson85;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //ArrayList. Метод set, remove
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("Вася");
        list.add("Аня");
        list.add("Оля");
        list.add("Леня");
        list.add(1,"Кирил");
        list.add(5,"Антон");
        list.set(1,"Антон");
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.remove(3));// или System.out.println(list.remove("Аня"));
        System.out.println(list);
    }
}
