package org.rsta80.java8features;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Examples about use of Date and Time API of JAVA 8
 */
public class DateAndTimeAPI {

    public static void main(String... args) {

        //LocalDate LocalTime LocalDateTime
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfYear());
        int dd = ldt.getDayOfMonth();
        int MM = ldt.getMonthValue();
        int yyyy = ldt.getYear();
        int hh = ldt.getHour();
        int mm = ldt.getMinute();
        int ss = ldt.getSecond();
        int nn = ldt.getNano();
        System.out.println(dd + "-" + MM + "-" + yyyy + " " + hh + ":" + mm + ":" + ss + ":" + nn);

        LocalDateTime costumDateTime = LocalDateTime.of(10, 10, 30, 10, 15, 10);
        System.out.println("My costum date is " + costumDateTime);
        System.out.println("After 6 months date is " + costumDateTime.plusMonths(6));

        //Period, Duration, Chronouit
        Period p = Period.between(LocalDate.now(), LocalDate.of(1989, 6, 29));
        System.out.println(p);

        System.out.println(LocalDate.of(1989, 6, 29).until(LocalDate.now(), ChronoUnit.DAYS));

        if (Year.of(LocalDate.now().getYear()).isLeap())
            System.out.println("This year is leap (Biciesto)");

        //Zones ZoneId ZoneLocalDateTime
        System.out.println(ZoneId.systemDefault());
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));


    }

}
