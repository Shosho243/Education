package Zada4ki;

import lesson83.Array;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        // Заменить все * на ‘a’
        //1 способ
        String string = "Неуд*ч - это просто возможность н*ч*ть снов , но уже более мудро";
        char oldChar = '*';
        char newChar = 'a';
        String s = replase(string,oldChar,newChar);
        System.out.println(s);
    }

    public static String replase(String string, char oldChar, char newChar) {
        if (string == null) {
            return "false";
        }
        char[] ch = string.toCharArray();
        for (int i = 0; i <ch.length; i++) {
            if(ch[i]==oldChar){
                ch[i]=newChar;
            }
        }

    return String.valueOf(ch);

        //2 способ через тернарный оператор
//        String string = "Неуд*ч - это просто возможность н*ч*ть снов , но уже более мудро";
//        char oldChar = '*';
//        char newChar = 'a';
//        String s = replase(string,oldChar,newChar);
//
//        System.out.println(s);
//    }
//
//    public static String replase(String string, char oldChar, char newChar) {
//        if (string == null) {
//            return "false";
//        }
//        char[] ch = string.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            ch[i] = ch[i] == oldChar ? newChar : ch[i];
//        }
//
//
//        return String.valueOf(ch);
    }
}

