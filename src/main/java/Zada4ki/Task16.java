package Zada4ki;

public class Task16 {
    public static void main(String[] args) {
        //посчитать кол-во дубликатов определенной строки
        // Annotation
        //1 способ
//    System.out.println(findCharInWord('a', "Annotation"));
//}
//public static int findCharInWord(char symbol,String word){
//    int count = 0;
//    for(char d : word.toCharArray()){
//        if (symbol == d){
//            count++;
//        }
//    }
//return count;


        //2 способ так надо решать
        System.out.println();

    }

    public static int findCharInWord(char symbol, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(symbol)) ;
            count++;

        }
        return count;
    }
}
