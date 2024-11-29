package lesson71;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Способы создания одномерных массивов в Java
        String house1 = "ул.Вишневая 45";
        String house2 = "ул.Вишневая 45";
        String house3 = "ул.Вишневая 45";
        String house4 = "ул.Вишневая 45";
        String house5 = "ул.Абрикосовая 45";
        String house6 = "ул.Абрикосовая 45";

        String[] houses = new String[6];
        String[] stores = new String[6];

        String[] busStations = new String[]{"г.Ньюйорк","Лос Анджелес","Миндюкино"};
        String[] hospitals = {"г.Ньюйорк","Лос Анджелес","Миндюкино"};
        System.out.println(Arrays.toString(busStations));



    }
}
