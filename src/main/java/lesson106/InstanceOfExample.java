package lesson106;

public class InstanceOfExample {
    public static void main(String[] args) {
        // instanceof является ли объектом , если при наследовании нет , то ошибка , если через интерфейс , то выйдет фолс
        Car car1 = new Car();
        System.out.println(car1 instanceof Car);
        SportCar sportCar = new SportCar();
        System.out.println(sportCar instanceof Car);
        Moto moto1 = new Moto();
        System.out.println(moto1 instanceof HaveEngine);
    }
}

class Car implements HaveEngine {

}

class SportCar extends Car implements HaveEngine {

}

class Moto implements HaveEngine {
}

interface HaveEngine {

}