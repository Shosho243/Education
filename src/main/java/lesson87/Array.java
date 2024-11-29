package lesson87;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //ArrayList. Методы clear, indexOf, lastIndexOf.
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Aыв");
        list1.add("Вася");
        list1.add("Аня");
        list1.add("Оля");
        list1.add("Леня");
        list1.add("Аня");
//        list1.clear();
        System.out.println(list1.indexOf("Аня"));
        System.out.println(list1.lastIndexOf("Аня"));

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Сергей");
        list2.add("Андрей");
        list2.add("Николай");
        list2.add("Эдуард");
        list2.add("Леня");
        list2.clear();
        System.out.println(list2);
    }
}
