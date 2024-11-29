package Zada4ki;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        //создать коллекцию написать прогррамму
        //Есть стринговый лист фамилий , нужно пройтись по списку
        //вытащить фамилии которые начинаются на А и поместить их
        //в другой список для дальнейшего работы с ними
        List<String> initialList = List.of("Аркадий","Артемов", "Сидоров", "Афанасьев", "Петров");
        List<String> result = initialList.stream()
                .filter(x -> x.startsWith("А"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
