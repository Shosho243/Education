package lesson93;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap. null. Методы putIfAbsent, get, remove.
        Map<Integer,String> mobileOperator = new HashMap<>();
        mobileOperator.put(50,"Vodaphone");
        mobileOperator.put(63,"Life");
        mobileOperator.putIfAbsent(93,"Life");
        mobileOperator.putIfAbsent(67,"Kievstar");
        mobileOperator.putIfAbsent(50,"Kievstar");// метод задействует , заменяет значение , если другой это значение не задействована
        mobileOperator.putIfAbsent(78,null);// метод задействует , заменяет значение , если другой это значение не задействована
        mobileOperator.putIfAbsent(null,"Kievstar");// метод задействует , заменяет значение , если другой это значение не задействована
        System.out.println(mobileOperator);
        System.out.println(mobileOperator.get(67));// Вывод значеня ключа
        System.out.println(mobileOperator.remove(67));// Удаление ключа
        System.out.println(mobileOperator);

    }
}
