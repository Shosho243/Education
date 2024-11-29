package lesson99;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {
    //Deque.
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(8);
        deque.addLast(2);
//        deque.removeLast();
//        deque.pollLast();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());//работает как get ,но в случае как в гет , не выводит ошибку , если элемента нет
        System.out.println(deque.peekFirst());
    }
}
