package lesson122;

import lesson83.Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        array=Arrays.stream(array).map(x->x*3).toArray();
        System.out.println(Arrays.toString(array));


    }
}
