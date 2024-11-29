package lesson72;

public class Array {
    public static void main(String[] args) {
//Циклы и массивы.
        String[] hospitals = {"г.Ньюйорк", "Лос Анджелес", "Миндюкино"};
        //                            0           1              2

//        System.out.println(Arrays.toString(hospitals));
//        System.out.println(hospitals[0]);
//        System.out.println(hospitals.length);

//        for (int i = 0; i < hospitals.length ; i++) {
//            System.out.println(hospitals[i]);
//
//        }
////          реверс
//        for (int i = 0; i < hospitals.length; i++) {
//            System.out.println(hospitals[hospitals.length - i - 1]);
//
//        }
        for (String element : hospitals) {
            System.out.println(element);

        }
    }
}
