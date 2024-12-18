package lesson127;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Streams. Метод sorted.
//        int[] array = {123, 4564, 76889, 4,7,0, 9,12,5,6,72,43,6 ,23,};
//        array=Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
        Car car1 = new Car("BMW", 150);
        Car car2 = new Car("FERRARi", 350);
        Car car3 = new Car("AUDI", 200);
        Car car4 = new Car("ZIL", 80);
        Car car5 = new Car("MAZDA", 225);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);

        cars= cars.stream().sorted((x,y)->x.getModel().compareTo(y.getModel())).collect(Collectors.toList());
        System.out.println(cars);


    }
}

class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}