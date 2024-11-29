package lesson97;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        //Queue. Методы add, remove, poll, element, peek.
        //распологает элементы так как вы сами их разложили
        Queue<String> queue = new LinkedList<String>();
        queue.add("Serg");
        queue.add("Anna");
        queue.add("Vanya");
        queue.add("Tanya");


        System.out.println(queue);
//        queue.remove(); всегда удаляет первый1 элемент или можем записать значение , но при работе с очередями не рекоменуют делать
//        queue.poll(); работают одинаково , но при удаление не происходит ошибка ,если элементы кончились

        System.out.println(queue.element());
        System.out.println(queue.peek());// безопасный метод для извлечения элемнита


    }
}
