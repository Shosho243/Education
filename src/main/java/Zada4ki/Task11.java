package Zada4ki;

public class Task11 {
    public static void main(String[] args) {
        //Вывести булевое значение на проверку является ли строка палиндромом (читается одинаково в обе стороны):
   String myString = "I hate java sometimes";

    }
    public static boolean palindrom(String string){
        char[] chars = string.toLowerCase().replace(" ","").toCharArray();

        int leftCounter = 0;
        int rigthCounter = chars.length-1;

        while (leftCounter<rigthCounter){
            char leftCh= chars[leftCounter];
            char ringCh= chars[rigthCounter];
            if (leftCh!=ringCh){
                return false;
            }
            leftCounter++;
            rigthCounter--;
        }
   return true; }
}
