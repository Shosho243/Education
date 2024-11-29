package lesson90;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //LinkedList. такой же как и ArrayList разница в том , что при добавление на индекс другие смещаются , а линкед заменяет ссылки предыдущего и последующего
        String man1 = "Serg";
        String man2 = "Ivan";
        String man3 = "Anton";
        String man4 = "Igor";
        String man5 = "Stepan";
        String man6 = "Marina";

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add(man1);
        linkedList1.add(man2);
        linkedList1.add(man3);
        linkedList1.add(man4);
        linkedList1.add(man5);
        linkedList1.add(2,man6);

        System.out.println(linkedList1);

    }
}
