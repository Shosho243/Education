package lesson75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Interface {
    public static void main(String[] args) {
        // Интерфейс Comparable
        List<Car> cars = new ArrayList<Car>();

        Car car1 = new Car(10, "BMW", 1500);
        Car car2 = new Car(2, "AUDI", 1500);
        Car car3 = new Car(5, "BMW", 1500);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        System.out.println(cars);
        Collections.sort(cars);
        System.out.println("Список после сортировки ");
        System.out.println(cars);
    }
}

    class Car implements Comparable<Car> {
        int id;
        String name;
        int price;

        public Car(int id, String name, int price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public int compareTo(Car car) {

//            if(this.id>car.id){
//                return 1;
//            }else if (this.id<car.id){
//                return -1;
//            }
//            return this.name.compareTo(car.name);
            //один и тот же способ
          int result = this.id-car.id;
            if ((this.id-car.id) == 0) {
                return this.name.compareTo(car.name);
            }
            return result;

        }
    }class priceComparator implements Comparator<Car>{

    @Override
    public int compare(Car car1, Car car2) {
        return car1.price - car2.price;//если нужно в убывании то return  car2.price-car1.price
        //если сравнивали имя то куегкт car1.name.compareTo(car2.name)
    }
}


