package lesson120;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DataAndTime {
    public static void main(String[] args) {
        //Дата и время. Методы get.
        LocalDate ld = LocalDate.of(2020, Month.APRIL, 15);
        LocalDateTime ldt = LocalDateTime.of(2010, Month.AUGUST, 10, 15, 30,15);
//        System.out.println(ld.getMonth());
//        System.out.println(ld.getMonthValue());
//      System.out.println(ld.getDayOfYear());
//      System.out.println(ldt.getDayOfYear());
        System.out.println(ld.getYear());
        System.out.println(ldt.getSecond());



    }
}
