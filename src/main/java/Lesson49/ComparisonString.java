package Lesson49;

public class ComparisonString {
    public static void main(String[] args) {
        // Сравнение строк. Метод compareTo.
        String i1 ="5";
        String i2 ="15";
        System.out.println(i1);
        System.out.println(i2);

        if (i1.compareTo(i2)>0){
            System.out.println("i1>i2");
        }else System.out.println("i1<i2");

    }
}
