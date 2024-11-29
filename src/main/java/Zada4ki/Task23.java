package Zada4ki;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task23 {
    public static void main(String[] args) {
        //первых 11 чисел фибоначи используем массив потом стримы
        //0,1
        int limitNums = 11;
        int[] numbers = new int[limitNums];
        numbers[1] = 1;
        numbers[2] = 1;
        for (int i = 3; i < limitNums; i++) {
            numbers[i] = numbers[i-1] +numbers[i-2];
        }
        System.out.println(Arrays.toString(numbers));
        int result = Stream.iterate(new int [] {0,1}, number -> new int[] {number[1],number[0]+number[1]})
                .limit(limitNums)
                .map(x->x[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);
    }
}
