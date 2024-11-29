package lesson117;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTime {
    //Дата и время. Методы.
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1996, Month.NOVEMBER,15);
//        System.out.println(localDate);
//        System.out.println(localDate.plusDays(15));
//        System.out.println(localDate.minusDays(15));
//        System.out.println(localDate.minusMonths(1));
        LocalDate localDate2 = localDate.minusDays(5);
        System.out.println(localDate);
        System.out.println(localDate2);


    }
}
