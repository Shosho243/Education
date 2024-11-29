package lesson101;

public class AnonimExample {
    public static void main(String[] args) {
        //Анонимные классы.
        MathOperation m1 = new MathOperation() {
            int c = 10;

            @Override
            public int plus(int a, int b) {
                return a + b + c;
            }

            @Override
            public int minus(int a, int b) {
                return a - b - c;
            }
        };
        System.out.println(m1.plus(5, 6));
        System.out.println(m1.minus(100, 2));
        ;
    }
}

interface MathOperation {
    int plus(int a, int b);

    int minus(int a, int b);
}
