package Lesson51;

public class ReverseString {
    public static void main(String[] args) {
        //Реверс строки
        String s1 = "Hello World";
        StringBuilder s2 = new StringBuilder(s1);
//с помощью insert
//        for (int i = 0; i < s1.length() ; i++) {
//            s2.insert(0,s1.charAt(i));
//            System.out.println(s2);

        //с помощью append
//        for (int i = s1.length()-1; i >= 0; i--) {
//            s2.append( s1.charAt(i));
//            System.out.println(s2);
//        }
// с помощью метода reverse
       s2.reverse();
        System.out.println(s2);
    }
}
