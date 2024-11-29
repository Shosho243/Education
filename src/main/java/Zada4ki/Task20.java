package Zada4ki;

import java.util.HashMap;
import java.util.Map;

public class Task20 {
    public static void main(String[] args) {
        //создать строку "Hello world!"  вывести символы и их количество в ней . Пешать в последнюю очередь
        //задачка редко или вообще не встречается на себесах
        String str = "Hello World";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character s : chars) {
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);

            }
        } System.out.println(map);
    }
}
