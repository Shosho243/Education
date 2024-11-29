package lesson102;

public class LambdaExample {
    public static void main(String[] args) {
        // Лямбда выражения.
        Slojenie slojenie = (int a,int b ) ->(a+b);
        System.out.println(slojenie.plus(4,6));

    }
}//функциональный интерфейс это тот , который имеет только один метод
@FunctionalInterface
interface Slojenie{
    int plus (int a, int b); 
}