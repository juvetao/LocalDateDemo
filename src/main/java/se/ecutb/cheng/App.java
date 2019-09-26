package se.ecutb.cheng;

import java.time.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        //LocalDate date = LocalDate.now();
//
//        LocalDate date2 = LocalDate.of(1280,7,13);
//
//
//        LocalDate myBirthDate = LocalDate.parse("1986-02-12");
//
//        LocalDate myDaughtersBirthDate = LocalDate.of(2014, Month.MARCH, 25);
//
//        Period period = Period.between(myBirthDate, myDaughtersBirthDate);//****
//        int yearDifference = period.getYears();
//        int monthDifference = period.getMonths();
//        int dayDifference = period.getDays();
//
//        System.out.println(yearDifference);
//
//        // LocalDate is immutable
//        int days = 0;
//        for(LocalDate date = myBirthDate; date.isBefore(myDaughtersBirthDate); days++, date2.plusDays(1)){
//        System.out.println(date);
//    }
//        System.out.println(days);


        //LocalTime
//        LocalTime time = LocalTime.now();
//        System.out.println(time);

//
//        LocalTime start = LocalTime.parse("08:00");
//        LocalTime end = LocalTime.of(17, 0);
//
//        System.out.println(start);
//        System.out.println(end);
//
//
//        Duration duration = Duration.between(start, end);
//        System.out.println(duration.toMinutes());

        //LocalDateTime
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);

//        LocalTime time = LocalTime.of(2,0);
//        LocalDate date = LocalDate.of(1999, 01, 03);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        System.out.println(dateTime);


        LocalDate date = LocalDate.parse("1991-07-07");
        System.out.println(date.getDayOfWeek());
        System.out.println(getAge(date));

        LocalDate dateMade = date.minusMonths(9);
        System.out.println(dateMade);
    }


    public static int getAge(LocalDate birthDate){
        Period p = Period.between(birthDate, LocalDate.now());
        return p.getYears();
    }
}
