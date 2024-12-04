package Practic;

public class Pr_1T1 {// Развернуть произвольную строку без использования метода типа reverse() и используя один массив

    public static void main(String[] args) {
        //1 способ
//        String str = "Hello World ";
//        int length = str.length();
//        char[] chars = new char[length];
//        int counter = 0;
//        for (int i = length - 1; i >= 0; i--) {
//            char temp = str.charAt(i);
//            chars[counter++]=temp;
//        }
//        System.out.println(chars);


        //2 способ
        char[] chars = ("Hello Wolrd").toCharArray();
        System.out.println(reverseString(chars));

    }

    public static char[] reverseString(char[] chars) {
        int i = 0;
        int k = chars.length - 1;
        for (; i < k; i++, k--) {
            char temp = chars[i];
            chars[i] = chars[k];
            chars[k] = temp;
        }
        return chars;
    }
}





