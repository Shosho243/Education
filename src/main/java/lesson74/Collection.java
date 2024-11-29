package lesson74;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    //Collections.sort()
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Anna");
        names.add("anna");
        names.add("Vova");
        names.add("Denis");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("После сортировки ");
        System.out.println(names);
        List<Integer> names1 = new ArrayList<>();
        names1.add(123);
        names1.add(2);
        names1.add(33);
        names1.add(454);
        names1.add(5);
        System.out.println(names1);
        Collections.sort(names1);
        System.out.println("После сортировки ");
        System.out.println(names1);


    }
}
