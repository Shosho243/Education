package Lesson28;

public class Continue {
    public static void main(String[] args) {
        //Оператор continue
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(j * 10 + i + 1 + "\t");

            }
            System.out.println("J-" + j);
        }
    }

}
