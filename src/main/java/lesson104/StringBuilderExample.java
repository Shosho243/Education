package lesson104;

public class StringBuilderExample {
    // StringBuilder. Методы.
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");

        sb1.append(" ");//метод добавляет все в конец в стринг билдера
        sb1.append("word");
        sb1.append(111);
        sb1.append(true);
        sb1.append(sb1);

        sb1.insert(2,222);//етод втсавляет что угодно на 2 позицию
        sb1.delete(2,3);//удаляет символы диапозона 2 символ не входит
        sb1.deleteCharAt(4);//удаляет символ
        sb1.reverse();//переворачивает строку
        sb1.replace(2,5,"New string"); // вставляем символы
        System.out.println(sb1);
        System.out.println(sb1.capacity());// кол-во памяти выделено для строки
        System.out.println(sb1.length());// кол-во символов
    }
}
