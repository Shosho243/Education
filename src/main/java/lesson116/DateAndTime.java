package lesson116;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTime {
    public static void main(String[] args) {
        //Дата и время. Создание объектов.
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
        LocalDate localDate = LocalDate.of(1995, Month.NOVEMBER,15);
        System.out.println(localDate.getDayOfWeek());
    }
}
