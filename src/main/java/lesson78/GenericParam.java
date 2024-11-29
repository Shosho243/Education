package lesson78;

public class GenericParam {
    public static void main(String[] args) {
        //Параметризированные классы
//        Example<String> example1 = new Example<>();
//        example1.field = "Вася";
//        System.out.println(example1.field);
//
//        Example<Integer> example2 = new Example<>();
//        example2.field = 2001;
//        System.out.println(example2.field);
Example<Double> e1 = new Example<>(3.12);
        System.out.println(e1.toString());

        Example<Boolean> e2 = new Example<>(false);
        System.out.println(e2.toString());

    }

}

class Example<T> {
    private T field;
    public  Example(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return ""+ field;
    }
}
