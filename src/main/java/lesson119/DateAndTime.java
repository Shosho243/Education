package lesson119;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
    public static void main(String[] args) {
        //Duration. Дата и время. Методы.
        Duration duration = Duration.ofSeconds(45);
        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        LocalTime lt2 = lt1.minus(duration);
        System.out.println(lt2);
    }
}
