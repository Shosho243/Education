package lesson108;

public class ToStringExample {
    public static void main(String[] args) {
        //toString у каждого объекта есть hashcode
        Car car1 = new Car("Audi","Black");
        Car car2 = new Car("Mazda","Green");

//        System.out.println("Авто 1 марка - "+ car1.name+ " цвет - " + car1.color);
//        System.out.println("Авто 1 марка - "+ car2.name+ " цвет - " + car2.color);
        System.out.println(car1);
//        System.out.println(car1.hashCode());
//        System.out.println(car1.toString());
    }
}
class Car {
    String name;
    String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
//    @Override
//    public String toString() {
//        return "Авто 1 марка - "+name  + " цвет - "+ color;
//    }
//}