package Practic;

public class Pr_9T11 {
    public static void main(String[] args) {
        //Вывести булевое значение на проверку является ли строка палиндромом (читается одинаково в обе стороны):
        //"I hate java sometimes";
        String str = "I hate java sometimes";
        System.out.println();
    }

    public static boolean palindrom(String str) {
        char[] chars = str.toLowerCase().replace(" ", "").toCharArray();
        int leftCounter = 0;
        int rightCounter = str.length() - 1;
        while (leftCounter < rightCounter) {
            char leftChar = chars[leftCounter];
            char rightChar = chars[rightCounter];
            if (leftChar != rightChar) {
                return false;
            } leftCounter++;
            rightCounter--;
        }


        return true;
    }
}
