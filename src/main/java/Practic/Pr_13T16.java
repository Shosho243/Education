package Practic;

public class Pr_13T16 {
    public static void main(String[] args) {
        //посчитать кол-во дубликатов определенной строки
        // Annotation
        System.out.println(countDub('a',"Annotation"));
    }

    public static int countDub(char symbol, String word) {
        int counter = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.toLowerCase(chars[i]) == Character.toLowerCase(symbol)) {
                counter++;
            }

        }
return counter;    }
}

