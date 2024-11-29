package lesson79;

public class Param {
    public static void main(String[] args) {
        // Параметризированные классы
        Car<String> car1 = new Car<>("BMW");
        System.out.println(car1.getField());
        car1.setField("Mercedes");
        System.out.println(car1.getField());
        String markaAvto = car1.getField();
        System.out.println(markaAvto);
        System.out.println("------------------");
         Car<Integer> car2 = new Car<>(25000);
        System.out.println(car2.getField());
        car2.setField(22000);
        System.out.println(car2.getField());
        int price = car2.getField();// либо String price = String.value.of(car2.getField());
        System.out.println(price);


    }
}

class Car<T> {//вместо T может быть любая буква или переменная
    private T field;

    public Car(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
