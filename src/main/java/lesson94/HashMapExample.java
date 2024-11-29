package lesson94;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap. Методы containsValue, containsKey, keySet, values.

        Map<Integer,String> mobileOperator = new HashMap<>();
        mobileOperator.put(50,"Vodaphone");
        mobileOperator.put(null,"Vodaphone");
        mobileOperator.put(63,"Life");
        mobileOperator.putIfAbsent(93,"Life");
        mobileOperator.putIfAbsent(67,"Kievstar");
        mobileOperator.putIfAbsent(null,"Kievstar");
     //   System.out.println(mobileOperator.containsValue("Kievstar")); // возвразает тру или фолс
//        System.out.println(mobileOperator.containsKey(50));// возвразает тру или фолс
        System.out.println(mobileOperator.keySet());// вызывает ключи
        System.out.println(mobileOperator.values());// вызывает значений
    }
}
