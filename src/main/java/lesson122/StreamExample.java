package lesson122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        //Streams. Массивы. Метод map.
      int[] array = {1,2,3,4,5,6,7,8,9};
        array=Arrays.stream(array).map(x ->x*3).toArray();
        System.out.println(Arrays.toString(array));

    }
}
