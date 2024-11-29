package Lesson46;

import java.util.Arrays;

public class MethodsString {
    public static void main(String[] args) {
        //Методы для работы со строками.
        String s1 = "Hello World";
        System.out.println(s1);
        String s2 = s1.toUpperCase();
        System.out.println("S2 - " + s2);
        System.out.println("Пишиет большими без изменения " + s1.toUpperCase());
        System.out.println("Пишиет маленькими без изменения " + s1.toLowerCase());

        System.out.println("Повторяет кол-во раз " + s1.repeat(3));
        System.out.println("Заменяет старый символ на новый " + s1.replace("ello", "123"));
        System.out.println("Вырезать под строку " + s1.substring(5, 9));
        s1 = "1234567890";
        System.out.println("Разделение строки на массив " + Arrays.toString(s1.split("5")));
        s1 =  "                      Hello                             World                                ";
        System.out.println(s1.trim());
        System.out.println(s1.strip());


        System.out.println("------------------------------------");
        System.out.println(s1);

    }
}
