package Practic;

public class Pr_4T4 {//написать программу которая проверяет , является ли одно слово анаграммой другого

    // на вход подается 2 строки . На выходе true или false
    // канонада, анаконда - true
    // стол,стул - false
    public static void main(String[] args) {
        String origin = "канонада";
        String anagram = "анаконда";
        System.out.println(isAnagram(origin, anagram));
    }

    public static boolean isAnagram(String origin, String anagram) {
        if (origin.length() != anagram.length()) {
            return false;
        }
        char[] oroginChars = origin.toCharArray();
        char[] anagramChars = anagram.toCharArray();
        boolean[] markers = new boolean[anagramChars.length];
        for (char temp : oroginChars) {
            for (int i = 0; i < anagramChars.length; i++) {
                if (temp == anagramChars[i]) {
                    if (!markers[i]) {
                        markers[i] = true;
                        break;
                    }
                }if(i==anagramChars.length-1){
                    return false;
                }
            }
        }
    return true;}
}



