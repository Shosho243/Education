package Zada4ki;

import java.util.Arrays;

public class Task4 {//написать программу которая проверяет , является ли одно слово анаграммой другого
    // на вход подается 2 строки . На выходе true или false
    // канонада, анаконда - true
    // стол,стул - false

    public static void main(String[] args) {
        //1 способ
//        String tabble = "канонада";
//        String chair = "анаконда";
//        System.out.println(isAnagramma(tabble,chair));
//
//    }
//
//    public static boolean isAnagramma(String tabble, String chair) {
//        if (tabble.length() != chair.length()) {
//            return false;
//        }
//    var chars1 = tabble.toCharArray();
//        Arrays.sort(chars1);
//        var chars2 = chair.toCharArray();
//        Arrays.sort(chars2);
//        for(int i = 0;i<tabble.length();i++){
//            if(chars1[i]!=chars2[i]){
//                return false;
//            }
//        }
//        return true;
        System.out.println(isAnagramma("стол", "стул"));
    }

    public static boolean isAnagramma(String origin, String anagram) {
        if (origin.length() != anagram.length()) {
            return false;
        }
        char[] originChars = origin.toCharArray();
        char[] anagramChars = anagram.toCharArray();
        boolean[] markers = new boolean[anagramChars.length];

        for (
                char temp : originChars) {
            for (int i = 0; i < anagramChars.length; i++) {
                if (temp == anagramChars[i]) {
                    if (!markers[i]) {
                        markers[i] = true;
                        break;
                    }
                }
                if (i == anagramChars.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}


