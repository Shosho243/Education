package lesson112;

public class ExceptionExample {
    public static void main(String[] args) {
        //Исключения. Exception. throws.
        System.out.println("Start program");
        try {
            test1();
        } catch (NullPointerException e) {
            System.out.println("Исключение в методе " + e);
        }


        System.out.println("Finish program");
    }

    public static void test1() throws NullPointerException {
        System.out.println("Start test1");
        String str = null;

        System.out.println(str.length());


        System.out.println("Finish test1");

    }
}
