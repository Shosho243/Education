package Practic;

public class Pr_1T1 {// Развернуть произвольную строку без использования метода типа reverse() и используя один массив

    public static void main(String[] args) {
//    String str = "Hello Wolrd";
//    int length = str.length();
//    char[] chars= new char[length];
//    int counter=0;
//    for(int i = length-1;i>=0;i--){
//        char symbol = str.charAt(i);
//        chars[counter++]=symbol;
//    }System.out.println(chars);

        char[] chars=("Hello Wolrd").toCharArray();
        System.out.println(revertString(chars));
    }
    public static char[] revertString(char [] chars){
        int i =0;
        int k = chars.length-1;
        for(;i>=k;k--,i++){
            char symbol = chars[i];
            chars[i]=chars[k];
            chars[k]=symbol;
        }
        return chars;
    }
}




