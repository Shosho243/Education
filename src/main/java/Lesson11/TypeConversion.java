package Lesson11;

public class TypeConversion {
    //Преобразование типов
    public static void main(String[] args) {

        int i = 1;
        String s = "1";
        System.out.println(i+s);

        int i2 = Integer.parseInt(s);
        System.out.println(i + i2);

        String s2 = String.valueOf(i);
        System.out.println(s+s2);
    }
}
