package Practic;

public class Pr_9T11 {
    public static void main(String[] args) {
        //Вывести булевое значение на проверку является ли строка палиндромом (читается одинаково в обе стороны):
        //"I hate java sometimes";
        String str = "I hate java sometimes";
        System.out.println(isPalaindrom(str));
    }

    public static boolean isPalaindrom(String str) {
        char[] chars = str.toLowerCase().replace(" ", "").toCharArray();
        int lc = 0;
        int rc = chars.length - 1;
        while (lc < rc) {
            char lch = chars[lc];
            char rch = chars[rc];
            if (lch != rch) {
                return false;
            }
            lc++;
            rc--;
        }
        return true;
    }
}

