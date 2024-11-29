package Lesson59;

public class ShortenedAnd {
    public static void main(String[] args) {
        //Укороченное И. Чем отличается && от &.
        int a = 10;
        int b = 20;
//       Операция увеличение числа на 1
//        ++a;
//        ++b;
//        System.out.println(a);
//        System.out.println(b);
//            true       true
        if (++a > 35 & ++b > 35) {
            System.out.println("-----------");
        }
        System.out.println(a);
        System.out.println(b);

        if (++a > 35 && ++b > 35) {
            System.out.println("-----------");
        }
        System.out.println(a);
        System.out.println(b);
    }

}
