package Lesson64;

import java.util.Arrays;

public class PassingVariables {
    public static void main(String[] args) {
        // Передача переменных по значению и по ссылке.
        //Притивный тип данных получаем такие значение как 21 и 20
        int a=20;
        fun1(a);
        System.out.println(a);

    }
    public static void fun1(int a){
        a++;
        System.out.println(a);

// Ссылочный тип данных получаем значения 21 и 21
//        int[] a={20};
//        fun1(a);
//        System.out.println(Arrays.toString(a));
//
//    }
//    public static void fun1(int[] a){
//        a[0]++;
//        System.out.println(Arrays.toString(a));
    }
}
