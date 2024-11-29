package Lesson47;

public class ReverseString {
    public static void main(String[] args) {
        //Реверс строки

        String s1 ="1234567890";

        for (int i = s1.length()-1; i >=0 ; i--) {
            System.out.print(s1.charAt(i));

        }
        System.out.println("");
        System.out.println("-------------------");

        System.out.println(s1);




    }
}
