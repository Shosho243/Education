package lesson88;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //ArrayList. Методы size, isEmpty, contains.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Aыв");
        list1.add("Вася");
        list1.add("Аня");
        list1.add("Оля");
        list1.add("Леня");
        list1.add("Аня");
//        System.out.println(list1.size()); Возвращает инт значение
        System.out.println(list1.isEmpty());//Возвращает тру или фолс
        System.out.println(list1.contains("Аня"));
    }
}
