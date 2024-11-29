package Zada4ki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task21 {
    public static void main(String[] args) {
        //Написать программу , которая на вход примет ArrayList трок
        // удаляет из него все дубликаты , не испольузя метод contain()
        //ArrayList<String> countries = new ArrayList<>();
        //1 cспособ
//        List<String> countries = new ArrayList<>();
//        countries.add("B");
//        countries.add("C");
//        countries.add("Z");
//        countries.add("B");
//        Set<String> countriesNew = new HashSet<>();
//        countriesNew.addAll(countries);
//        countries.clear();
//        countries.addAll(countriesNew);
//        System.out.println(countriesNew);


        //2 способ е рабочий проверь что там
        List<String> countries = new ArrayList<>();
        countries.add("B");
        countries.add("C");
        countries.add("Z");
        countries.add("B");
        Set<String> countriesNew = new HashSet<>();
        for (String s : countriesNew){
            countriesNew.add(s);
        }
        System.out.println(countriesNew);
    }
}
