package Zada4ki;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task26 {
    public static void main(String[] agrs) {
        //Написать метод , который принимает на вход строку и ищет в ней самую длинную подстроку
        // состоящую из одинаковых символов
        // Если таких подстрок несколько , то искомая подстрака - самая левая.
        //метод возвращает найденную подстроку
        //1cпособ
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
            System.out.println(max);
//        }


            //2 способ с помощью метода
//        var input = "1551117770000000000009";
//        System.out.println(subString(input));
//
//    }
//
//    private static String subString(String input) {
//        if (input == null || input.isEmpty()) {
//            throw new IllegalArgumentException("String can't be null or empty");
//        }
//        if (input.length() == 1) {
//            return input;
//        }
//        var chars = input.toCharArray();
//        var map = new LinkedHashMap<Character, Integer>();
//        for (var temp : chars) {
//            map.compute(temp, (_, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//        }
//
//        return map.entrySet().stream()
//                .max(Comparator.comparingInt(Map.Entry::getValue))
//                .map(entry -> {
//                    var stringBuilder = new StringBuilder();
//                    var currentChar = entry.getKey();
//                    stringBuilder.append(
//                            String.valueOf(currentChar)
//                    .repeat(Math.max(0, entry.getValue()))
//                    );
//                    return stringBuilder.toString();
//                }).orElseThrow(IllegalArgumentException::new );
        }
    }
}
