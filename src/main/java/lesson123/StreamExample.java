package lesson123;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Метод filter.
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

        List<Car> filteret = cars.stream().filter(c ->
                c.getSpeed() > 150 && c.getModel().charAt(0) == 'F'
        ).collect(Collectors.toList());
        System.out.println(filteret);

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