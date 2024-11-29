package Lesson69;

public class ReverseNumber {
    public static void main(String[] args) {
        //Практика. Реверс числа.
        int number = 12345678;
        //654321

        System.out.println(reverse(number));


    }

    private static int reverse(int number) {
        int newNumber = 0;
        while (number != 0) {
            newNumber = number % 10 + newNumber * 10;
            number = number / 10;
            System.out.println(newNumber);
        }
        return newNumber;

    }
}
