package lesson81;

public class Param {
    public static void main(String[] args) {
        // Параметризированные классы
        Car<String,Double> car1 = new Car<>("BMW",250.5);
        System.out.println("Марка авто - " + car1.getField1() + " , скорость  " + car1.getField2());

    }
}

class Car <G1, G2>{//статическим полям generic применить не можем
    public static String used ;
    private G1 field1;
    private G2 field2;

    public Car(G1 field1, G2 field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public G1 getField1() {
        return field1;
    }

    public void setField1(G1 field1) {
        this.field1 = field1;
    }

    public G2 getField2() {
        return field2;
    }

    public void setField2(G2 field2) {
        this.field2 = field2;
    }
}
