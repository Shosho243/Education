package Practic;

import java.util.HashMap;
import java.util.Map;

public class Pr_19T22 {
    public static void main(String[] args) {
        //Упади семь раз и восемь поднимись
        //подсчиать кол-во слов в предложений
        //1 way
//        String sentense = "Упади семь раз и восемь поднимись";
//        String[] words = sentense.split(" ");
//
//        Map<String, Integer> wordsMap = new HashMap<>();
//        for (String word : words) {
//            if (wordsMap.containsKey(word)) {
//                wordsMap.put(word, wordsMap.get(word) + 1);
//            } else {
//                wordsMap.put(word,1);
//
//            }
//        }System.out.println(wordsMap);


        //2way
        String sentense = "Упади семь раз и восемь поднимись";
        String[] words = sentense.split(" ");

        Map<String,Integer > wordsMap = new HashMap<>();
        for (int i = 0; i < words.length-1; i++) {
            if (wordsMap.containsKey(words[i])) {
                wordsMap.compute(words[i], (_, c) -> c + 1);
            } else wordsMap.put(words[i], 1);
        }System.out.println(wordsMap);
    }
}




