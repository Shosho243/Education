package Lesson62;

public class VisionVariables {
    public static void main(String[] args) {
        //Локальные переменные и блок.
        {
            int a = 888;
            System.out.println(a / 2);
        }
        {
            int a = 444;
            System.out.println(a / 2);
            int b = 100;
            System.out.println(b+a);
        }
    }
}
