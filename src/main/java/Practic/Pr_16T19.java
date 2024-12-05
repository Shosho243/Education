package Practic;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Pr_16T19 {
    public static void main(String[] args) {
        //Валидация скобочной последовательности ({[]})
        //1way
//        String str = "({[]})";
//        System.out.println(valid(str));
//
//    }
//
//    public static boolean valid(String str) {
//        char[] chars = str.toCharArray();
//        Map<Character, Character> map = new HashMap<>();
//        map.put(')', '(');
//        map.put('}', '{');
//        map.put(']', '[');
//        Stack<Character> stack = new Stack<>();
//        for (Character temp : chars) {
//            if (map.containsValue(temp)) {
//                stack.push(temp);
//            } else {
//                if (stack.isEmpty() || stack.pop() == map.get(temp)) ;
//            }
//        }
//        return stack.isEmpty();

        //2way
        String str = "({[]})";
        System.out.println(valid(str));

    }

    public static boolean valid(String str) {
        char[] chars = str.toCharArray();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        Map<Character, Character> map = new HashMap();
        for (char temp : chars) {
            switch (temp) {
                case '(' -> counter1++;
                case ')' -> counter1--;
                case '}' -> counter2++;
                case '{' -> counter2--;
                case ']' -> counter3++;
                case '[' -> counter3--;
            }
        }
        return counter1 == 0 && counter2 == 0 && counter3 == 0;
    }
}
