package Lesson55;

public class AbsenceReturn {
    public static void main(String[] args) {
        //Отсутствие return
        int a = 10;
        int b = 10;
        String result = funPlus(a, b);
        System.out.println(result);


    }

    private static String funPlus(int x, int y) {
        if (x > y) {
            return "Число A больше Б";
        } else if (x < y) {
            return "Число А больше Б";
        }
        return "Число А=Б";
    }
}
