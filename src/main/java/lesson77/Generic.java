package lesson77;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        //Знакомство с generic. Ошибки компилятора всегда проще исправить чем runtime ошибки
        List<String> list1 = new ArrayList();
        list1.add("String 1");
        list1.add("String 2");
        list1.add("String 3");
        list1.add("String 4");
        list1.add(String.valueOf(23));
        list1.add(String.valueOf(false));
        for (String element : list1) {
            System.out.println(((String)element).length());
        }
    }
}
