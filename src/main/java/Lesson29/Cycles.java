package Lesson29;

public class Cycles {
    public static void main(String[] args) {
        // Вложенные циклы
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print(i*10+j+1 + "\t");
            };
            System.out.println("J-" +i);

        }
    }
}
