package Lesson50;

public class ChangeString {
    public static void main(String[] args) {
        //Изменяем строки. StringBuilder.
        String s1 = "Hello World";

        StringBuilder s2 = new StringBuilder();
        System.out.println();
        s2.append("World");
        System.out.println(s2);
        s2.insert(0,"Hello");
        System.out.println(s2);
//        s2.setLength("Устонавливает длину "2);
//        s2.delete("Удаляет строки "6,9);
//        s2.reverse(); Переворачивает строку
        s2.deleteCharAt(8);
        System.out.println(s2);


    }
}
