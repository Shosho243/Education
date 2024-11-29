package lesson115;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        //Дата и время в Java.
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }//YYYY-MM-DD
    //HH:MM:SS.nnnnnnnnn
    //YYYY-MM-DDTHH:MM:SS.nnnnnnnnn
}
