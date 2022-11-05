package day12_localdatetimeVarragsOverloadingOverriding;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_LocalDateTime {

    public static void main(String[] args) {
        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
   Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun sonra dogdu.
   Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
   Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */
        LocalDate dogTom= LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogTom);
         LocalDate dogVeli =LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24) .minusMonths(2).minusDays(11);
        System.out.println(dogVeli);
        boolean ayniMi=dogTom.isEqual(dogVeli);
        System.out.println(ayniMi);//datelerde is egual kullaniriz
         // iki sat dilimi arasindaki farki hesaplama
        //japonya ile almanya arasindaki saat farkini saat cinsinden hesaplayan kod
        LocalDateTime farkJaponya=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime farkAlmanya =LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long fark = ChronoUnit.HOURS.between(farkAlmanya,farkJaponya);//chronoUniot methodu unutma
        System.out.println(fark);
        //ex: Tarih 2022-10-31 ve saat 03:26:00 pm oldugunda asagidaki kod ne yazdirir
        LocalTime time  =LocalTime.now();
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("HH:mm");



        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(dtf2.format(time.minusHours(1)));//17:26:00

        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf2.format(time.minusHours(1)));//17:26:
        //mevcut saat diliminden ileri geri gitme.Mevcut saat diliminden 2 saat ileriyi yazdiriniz
        LocalTime time2=LocalTime.now();
        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(time2.plusHours(2)));






    }



}



