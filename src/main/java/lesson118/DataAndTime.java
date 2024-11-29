package lesson118;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DataAndTime {
    public static void main(String[] args) {
        //Period. Дата и время. Методы.
        Period period = Period.ofWeeks(2);

        LocalDate localDate1 = LocalDate.of(2000, Month.SEPTEMBER, 1);


        LocalDate localDate2 = localDate1.plus(period);
        System.out.println(localDate1);
        System.out.println(localDate2);
//        System.out.println(localDate1.isEqual(localDate2));
//        System.out.println(localDate1.isBefore(localDate2));
//        System.out.println(localDate1.isAfter(localDate2));
//        System.out.println(localDate1.isLeapYear());


    }
}
