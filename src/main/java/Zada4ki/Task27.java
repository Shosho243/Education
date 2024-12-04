package Zada4ki;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        //развернуть строку с помощью рекурсиии
//        String myString = "I hate java sometimes";
//        System.out.println();
//
//
//
//    }
//    public static String reverseString(String string,int index){
//        if(index==0){
//            return string.charAt(0) + "";
//        }
//        char random = string.charAt(index);
//        return random + reverseString(string,index-1);


        //развернуть строку с помощью массива чаров

//        String myString = "I hate java sometimes";
//        int stringLength =myString.length(); //задаем длину строки
//        char[] chars = new char[stringLength];
//        int counter = 0;
//        for(int i = stringLength -1;i>=0;i--){
//            char temp = myString.charAt(0);
//            chars[counter++] = temp;
//        }
//        System.out.println(new String(chars));


//        //разворот строки с помощью цикла WHILE
//        String st = "I hate java sometimes";
//        char[] chars = st.toCharArray();
//        System.out.println();
//
//    }
//
//    public static char[] reverse(char[] chars) {
//        int left = 0;
//        int right = chars.length - 1;
//        while (left < right) {
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//            left++;
//            right++;
//        }
//        return chars;


        //развернуть строку Scanner через цикл for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку : ");
        String myString = scanner.nextLine();

        StringBuilder reverse  = new StringBuilder();
        int stringLength = myString.length();

        for(int i = stringLength-1;i>=0; i--){
            reverse.append(myString.charAt(i));

        }
System.out.println(reverse);
    }
}
