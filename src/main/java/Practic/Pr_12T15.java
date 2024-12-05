package Practic;

public class Pr_12T15 {
    public static void main(String[] args) {
        //Заменить все * на ‘a’
        // Неуд*ч - это просто возможность н*ч*ть снов , но уже более мудро
        //1 way
//        String str = "Неуд*ч - это просто возможность н*ч*ть снов , но уже более мудро";
//        char oldChar = '*';
//        char newChar = 'а';
//        String s =replase(str,oldChar,newChar);
//        System.out.println(s);
//
//    }
//
//    public static String replase(String str, char oldChar, char newChar) {
//        if (str == null) {
//            return "false";
//        }
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == oldChar) {
//                chars[i] = newChar;
//            }
//        }
//        return String.valueOf(chars);

        //2 way
        String str = "Неуд*ч - это просто возможность н*ч*ть снов , но уже более мудро";
        char oldChar = '*';
        char newChar = 'а';
        String s = replase(str,oldChar,newChar);
        System.out.println(s);


    }

    public static String replase(String str, char oldChar, char newChar) {
        if (str == null) {
            return "false";
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = chars[i] == oldChar ? newChar : chars[i];

        }
        return String.valueOf(chars);
    }
}
