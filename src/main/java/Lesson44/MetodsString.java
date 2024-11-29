package Lesson44;

import java.util.Arrays;

public class MetodsString {
    public static void main(String[] args) {
        //Методы для работы со строками.
        String s1 = "Hello";
        System.out.println("Длина строки - " + s1.length());
        System.out.println("Симвл по индексу - " + s1.charAt(2));
        System.out.println("Массив - " + s1.toCharArray());
        System.out.println("Массив - " + Arrays.toString(s1.toCharArray()));
    }
}
