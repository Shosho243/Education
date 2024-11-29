package Practic;

import java.util.List;
import java.util.stream.Collectors;

public class Pr_7T9 {
    public static void main(String[] args) {
        //создать коллекцию написать прогррамму
        //Есть стринговый лист фамилий , нужно пройтись по списку
        //вытащить фамилии которые начинаются на А и поместить их "Аркадий", "Артемов", "Сидоров", "Афанасьев", "Петров"
        //в другой список для дальнейшего работы с ними

        List<String> initialName = List.of("Аркадий", "Артемов", "Сидоров", "Афанасьев", "Петров");
        List<String> result = initialName
                .stream()
                .filter(x->x.startsWith("А"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
