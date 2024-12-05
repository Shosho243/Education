package Practic;

import java.util.Arrays;
import java.util.stream.Stream;

public class Pr_20T23 {
    public static void main(String[] args) {
        //Вычислить первых 11 чисел Фибоначи и сумму этих чисел
        int limitNum = 11;
        int[] numbers = new int[limitNum];
        numbers[1] = 1;
        numbers[2] = 1;
        for (int i = 3; i < limitNum; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        System.out.println(Arrays.toString(numbers));
        int result = Stream.iterate(new int[]{0, 1}, number -> new int[]{number[1], number[0] + number[1]})
                .limit(limitNum)
                .map(x -> x[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);

    }
}