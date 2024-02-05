package javaCore.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.Temporal;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate =   LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);




        LocalDate localDateTest =  LocalDate.of(2019, Month.DECEMBER, 12);
        System.out.println(localDateTest);
    }
}
