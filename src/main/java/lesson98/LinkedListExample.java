package lesson98;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        //сам располагает элементы по порядку
        //PriorityQueue.
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Serg");
        queue.add("anna");
        queue.add("Vanya");
        queue.add("Tanya");

        System.out.println(queue);

    }
}
