package lesson92;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemple {
    public static void main(String[] args) {
        //HashMap.
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(123,"первая строка");
        map1.put(456,"вторая строка");
        map1.put(789,"вторая строка");
        map1.put(789,"третья строка");

        System.out.println(map1);
    }
}
