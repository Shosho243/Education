package Practic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pr_17T21 {
    public static void main(String[] args) {
        ////Написать программу , которая на вход примет ArrayList трок
        //        // удаляет из него все дубликаты , не испольузя метод contain()
        //        //ArrayList<String> countries = new ArrayList<>();
        List<String> countries = new ArrayList<>();
        countries.add("Москва");
        countries.add("Минск");
        countries.add("Москва");
        Set<String> result = new HashSet<>();
        result.addAll(countries);
        countries.clear();
        countries.addAll(result);
        System.out.println(countries);


    }
}
