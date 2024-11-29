package lesson111;

public class ExeptionExample {
    public static void main(String[] args) {
        //Исключения. Exception. finally.
        int a = 5 ;
        int b = 2 ;
        System.out.println("Start program");
        try {
            System.out.println("Start try ");
            int c = a / b ;
            System.out.println("End try ");
        }catch (ArithmeticException e) {
            System.out.println("Start CATCH");
            System.out.println("Exception "+ e );
            System.out.println("End CATCH");
        }finally {
            System.out.println("Block Finally ");

        }

        System.out.println("End program");
    }
}
