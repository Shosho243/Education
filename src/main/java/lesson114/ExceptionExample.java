package lesson114;

public class ExceptionExample {
    public static void main(String[] args) {
        //Исключения. ClassCastException.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal[] arrayOfAnimals = {dog, cat};
try {
    Cat cat2 = (Cat) arrayOfAnimals[0];
    Dog dog2 = (Dog) arrayOfAnimals[1];
}catch (ClassCastException e){
    System.out.println("Исключение ");
}

    }
}

class Animal {
}

class Cat extends Animal {
}

class Dog extends Animal {
}
