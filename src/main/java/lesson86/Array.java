package lesson86;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        //ArrayList. Метод addAll().
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("Вася");
        list1.add("Аня");
        list1.add("Оля");
        list1.add("Леня");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Сергей");
        list2.add("Андрей");
        list2.add("Николай");
        list2.add("Эдуард");
        list2.add("Леня");
        System.out.println(list2);

        list1.addAll(2,list2);// или list1.addAll(4,list1);
        System.out.println(list1);
    }
}
