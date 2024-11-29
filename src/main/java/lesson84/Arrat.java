package lesson84;

import lesson83.Array;

import java.util.ArrayList;

public class Arrat {
    public static void main(String[] args) {
        //ArrayList. Метод add.

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Вася");
        list1.add("Аня");
        list1.add("Оля");
        list1.add("Леня");
        list1.add(1,"Кирил");
        list1.add(5,"Антон");

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//
//        }

        for (String list: list1){
            System.out.println(list);
        };


    }
}
