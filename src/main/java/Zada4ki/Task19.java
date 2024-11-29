package Zada4ki;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Task19 {
    public static void main(String[] args) {
        //Валидация скобочной последовательности ({[]})
        //1 cпособ
//        String str = "({[]})";
//        System.out.println(isValidate(str));
//    }
//
//    public static boolean isValidate(String str) {
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
//                if (stack.isEmpty() || stack.pop() != map.get(temp)) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();


//        System.out.println("(([{}])");
//        //2 спопоб с помощью if
//    }
//
//    public static boolean valid(String string) {
//        if (string == null) {
//            return false;
//        }
////        char[] chars = strin.toCharArray();
//        int counter1 = 0;
//        int counter2 = 0;
//        int counter3 = 0;
//        for (char i : string.toCharArray()) {
//            if (i == '(') {
//                counter1++;
//            } else if (i == ')')
//                counter1--;
//            if (counter1 != 0) {
//                return false;
//            } else if (i == '[') {
//                counter2++;
//            } else if (i == ']') {
//                counter2--;
//                if (counter2 != 0) {
//                    return false;
//                }
//            } else if (i == '{') {
//                counter3++;
//            } else if (i == '}') {
//                counter3--;
//                if (counter3 != 0) {
//                    return false;
//                }
//
//            }
//
//        }
//        return counter1 == 0 && counter2 == 0 && counter3 == 0;

        //3 способ switch
//        String str = "([{}])";
//        System.out.println(valid(str));
//    }
//
//    public static boolean valid(String str) {
//        char[] chars = str.toCharArray();
//        int counter1 = 0;
//        int counter2 = 0;
//        int counter3 = 0;
//        for (char i : chars) {
//            switch (i) {
//                case ('('):
//                    counter1++;
//                    break;
//                case (')'):
//                    counter1--;
//                    break;
//                case ('['):
//                    counter2++;
//                    break;
//                case (']'):
//                    counter2--;
//                    break;
//                case ('{'):
//                    counter3++;
//                    break;
//                case ('}'):
//                    counter3--;
//                    break;
//                default:
//                    System.out.println("Это не скобка");
//
//            }
//        }
//        return counter1 == 0 && counter2 == 0 && counter3 == 0;
//
//
//

        //4 способ
//        String str = "([{}])";
//        System.out.println(valid(str));
//    }
//
//    public static boolean valid(String str) {
//        Stack<Character> stack = new Stack<>();
//        for (char i : str.toCharArray()) {
//            switch (i) {
//                case ('('):
//                    stack.add(')');
//                    break;
//                case (')'):
//                    if (stack.isEmpty() || stack.pop() != ')') {
//                        return false;
//                    }
//                    break;
//                case ('['):
//                    stack.add(']');
//                    break;
//                case (']'):
//                    if (stack.isEmpty() || stack.pop() != ']') {
//                        return false;
//                    }
//                    break;
//                case ('{'):
//                    stack.add('}');
//                    break;
//                case ('}'):
//                    if (stack.isEmpty() || stack.pop() != '}') {
//                        return false;
//                    }
//                    break;
//            }
//        }
//        return stack.isEmpty();


        //5 способ
        String str = "([{}])";
        System.out.println(valid(str));
    }

    public static boolean valid(String str) {
        char[] chars = str.toCharArray();
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (char i : chars) {
            switch (i) {
                case '(' -> counter1++;
                case ')' -> counter1--;
                case '[' -> counter2++;
                case ']' -> counter2--;
                case '{' -> counter3++;
                case '}' -> counter3--;

            }
        }
        return counter1 == 0 && counter2 == 0 && counter3 == 0;
    }
}

