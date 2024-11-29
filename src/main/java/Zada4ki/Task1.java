package Zada4ki;

public class Task1 {
    public static void main(String[] args) {
        // Развернуть произвольную строку без использования метода типа reverse() и используя один массив

//        char[] chars = ("Hello World").toCharArray();
//        System.out.println(revertString(chars));
        String str = "Hello World";
        int length = str.length();
        char[] chars = new char[length];
        int counter = 0;
        for (int i = length - 1; i >= 0; i--) {
            char symbol = str.charAt(i);
            chars[counter++] = symbol;

        }
        System.out.println(chars);


    }

    public static char[] revertString(char[] chars) {
        char symbol;
        int i = 0;
        int k = chars.length - 1;
        for (; i <= k; i++, k--) {
            symbol = chars[i];
            chars[i] = chars[k];
            chars[k] = symbol;

        }
        return chars;
    }
}

