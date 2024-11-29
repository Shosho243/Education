package lesson100;

public class FinalExample {
    public static void main(String[] args) {
        //Ключевое слово final. означает значение не может быть изменено в любом место программы
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(30);

        System.out.println(animal1.speed);
        System.out.println(animal2.speed);

//        animal1.speed = 320; значения нельзя поменять из за final
//        animal2.speed = 490;
    }
}

class Animal {
    final int speed;

    public Animal(int speed) {
        this.speed = speed;
    }

    public Animal() {
        speed = 20;

    }
}

