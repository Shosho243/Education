package lesson110;

public class ExeptionExample {
    public static void main(String[] args) {
        // Исключения. Exception. try, catch.
        System.out.println("Start program");
        int[] array = {0, 1, 2, 3, 4};


        try {
            System.out.println("Start block try");
//           System.out.println(array[11]);
            System.out.println("End block try");
            int temp = 5 / 0;
        } catch (NullPointerException e) {
            System.out.println("Start block CATCH");
            System.out.println("Описание эксепшена " + e);
            System.out.println("End block CATCH");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Второй блок try catch" + e);
        } catch (ArithmeticException e) {
            System.out.println("Третий блок try catch" + e);
        } catch (Exception e) {
            System.out.println("Четвертый блок try catch" + e);


        }


        System.out.println("End of program");
    }
}
