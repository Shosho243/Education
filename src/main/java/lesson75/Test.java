package lesson75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Animal dog = new Animal(9, "Bucha", 15);
        Animal cat = new Animal(3, "Mucha", 14);
        Animal spider = new Animal(8, "Spudy", 1);
        animals.add(dog);
        animals.add(cat);
        animals.add(spider);
        System.out.println(animals);
        Collections.sort(animals, new priceComparators());
        System.out.println("Список после сортировки");
        System.out.println(animals);

    }
}

class Animal implements Comparable<Animal>{
    int leg;
    String name;
    int age;

    public Animal(int leg, String name, int age) {
        this.leg = leg;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "leg=" + leg +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Animal animal) {
        int result = this.age - animal.age;
        if (result == 0) {
            return this.name.compareTo(animal.name);
        }return result;
    }
}class priceComparators implements Comparator<Animal> {

    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal1.age-animal2.age;
    }
}
