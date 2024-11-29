package Lesson65;

public class PassingVariables {
    public static void main(String[] args) {
        //Передача переменных по значению и по ссылке.
        int a = 20;
       a= fun1(a);
        System.out.println(a);


    }

    public static int fun1(int b) {
        b++;
        System.out.println(b);
        return b;
    }
}
