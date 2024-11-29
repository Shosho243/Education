package lesson89;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Iterator.
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Anton");
        al1.add("Pavel");
        al1.add("Denis");
        al1.add("Vadim");
        al1.add("Anton");

        Iterator<String> iterator = al1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());//iterator.remove
        }

        }
    }

