package Practic;

public class Pr_22T26 {
    public static void main(String[] args) {
        //Написать метод , который принимает на вход строку и ищет в ней самую длинную подстроку
        // состоящую из одинаковых символов
        // Если таких подстрок несколько , то искомая подстрака - самая левая.
        //метод возвращает найденную подстроку
        //1551117770000000000009
        //1 споосб
        String input = "1551117770000000000009";
        StringBuilder max = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        char[] chars = input.toCharArray();
        char c = chars[0];
        for (int i = 0; i < input.length(); i++) {
            if (c == chars[i]) {
                temp.append(c);
            } else {
                c = chars[i];
                temp = new StringBuilder();
                temp.append(c);
            }
            if (temp.length() > max.length()) max = temp;
            System.out.print(max);
        }
    }
}

