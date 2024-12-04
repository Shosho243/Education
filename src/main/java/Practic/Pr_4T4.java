package Practic;

import java.util.Arrays;

public class Pr_4T4 {
    //написать программу которая проверяет , является ли одно слово анаграммой другого
    // на вход подается 2 строки . На выходе true или false
    // канонада, анаконда - true
    // стол,стул - false
    public static void main(String[] args) {
        String word1 = "стол";
        String word2 = "стул";
        System.out.println(isAnagrama(word1, word2));
    }

    public static boolean isAnagrama(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        var chars1 = word1.toCharArray();
        var chars2 = word2.toCharArray();
        boolean[] markers = new boolean[chars2.length];
        for (char temp : chars1) {
            for (int i = 0; i < chars2.length; i++) {
                if (temp == chars2[i]) {
                    if (!markers[i]) {
                        markers[i] = true;
                        break;
                    }
                }
                if (i == chars2.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}




