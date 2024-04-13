package org.example.trip;

import java.time.*;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

/*
2 Пользователь планирует поездку из Берлина в Стамбул на автомобиле. Выберите
несколько точек на маршруте и прикиньте длительность путешествия между этими
точками. Пользователь вводит дату и время своего отправления. Программа должна
вывести расписание (местные дату и время), когда пользователь должен прибыть в
указанные пункты.
 */
public class WegNachHaus {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        PointOfTrip point1 = new PointOfTrip("Berlin", ZonedDateTime.of(LocalDate.of(2024,Month.APRIL,13),LocalTime.of(10,0),ZoneId.of("Europe/Berlin")));
        PointOfTrip point2 = new PointOfTrip("Dresden", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("CET")));
        PointOfTrip point3 = new PointOfTrip("Prague", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Europe/Prague")));
        PointOfTrip point4 = new PointOfTrip("Vienna", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Europe/Vienna")));
        PointOfTrip point5 = new PointOfTrip("Budapest", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Europe/Budapest")));
        PointOfTrip point6 = new PointOfTrip("Belgrade", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Europe/Belgrade")));
        PointOfTrip point7 = new PointOfTrip("Sofia", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Europe/Sofia")));
        PointOfTrip point8 = new PointOfTrip("Instanbul", ZonedDateTime.of(LocalDate.of(2024, Month.APRIL, 13), LocalTime.of(10, 0), ZoneId.of("Asia/Istanbul")));
        System.out.println("Start : " + point1.getName() + "   -->   " + point1.getDateTime());
        System.out.println();

        point2.setDateTime(point1.getDateTime().plusHours(1).plusMinutes(56).withZoneSameInstant(ZoneId.of("CET")));
        System.out.println("Coffee break  : " + point2.getName() + "   -->   " + point2.getDateTime());
        System.out.println();

        point3.setDateTime(point2.getDateTime().plusHours(1).plusMinutes(29).withZoneSameInstant(ZoneId.of("Europe/Prague")));
        System.out.println("Coffee break  : " + point3.getName() + "   -->   " + point3.getDateTime());
        System.out.println();

        point4.setDateTime(point3.getDateTime().plusHours(3).plusMinutes(20).withZoneSameInstant(ZoneId.of("Europe/Vienna")));
        System.out.println("Coffee break  : " + point4.getName() + "   -->   " + point4.getDateTime());
        System.out.println();

        point5.setDateTime(point4.getDateTime().plusHours(2).plusMinutes(26).withZoneSameInstant(ZoneId.of("Europe/Budapest")));
        System.out.println("Coffee break  : " + point5.getName() + "   -->   " + point5.getDateTime());
        System.out.println();

        point6.setDateTime(point5.getDateTime().plusHours(3).plusMinutes(47).withZoneSameInstant(ZoneId.of("Europe/Belgrade")));
        System.out.println("Coffee break  : " + point6.getName() + "   -->   " + point6.getDateTime());
        System.out.println();

        point7.setDateTime(point6.getDateTime().plusHours(3).plusMinutes(56).withZoneSameInstant(ZoneId.of("Europe/Sofia")));
        System.out.println("Coffee break  : " + point7.getName() + "   -->   " + point7.getDateTime());
        System.out.println();

        point8.setDateTime(point7.getDateTime().plusHours(5).plusMinutes(31).withZoneSameInstant(ZoneId.of("Asia/Istanbul")));
        System.out.println("Arrival : " + point8.getName() + "   -->   " + point8.getDateTime());
        System.out.println();

        long minutes = ChronoUnit.MINUTES.between(point1.getDateTime(), point2.getDateTime()) +
                ChronoUnit.MINUTES.between(point2.getDateTime(), point3.getDateTime()) +
                ChronoUnit.MINUTES.between(point3.getDateTime(), point4.getDateTime()) +
                ChronoUnit.MINUTES.between(point4.getDateTime(), point5.getDateTime()) +
                ChronoUnit.MINUTES.between(point5.getDateTime(), point6.getDateTime()) +
                ChronoUnit.MINUTES.between(point6.getDateTime(), point7.getDateTime()) +
                ChronoUnit.MINUTES.between(point7.getDateTime(), point8.getDateTime());

        System.out.println(" Длительность маршрута в минутах : " + minutes);
        System.out.printf(" Длительность маршрута в часах %d и минутах %d\n: ",minutes/60,minutes % 60);
        System.out.println("Местное время прибытия в Стамбул " + point1.getDateTime().plusMinutes(25).plusHours(22 + 1)); // TODO как найти сдвиг времени относительно UTC format long



    }
}

// Berlin - Dresden 193 km / 100 km per hour = 1 hour 56 min ;
// Dresden - Prague 149 km  avg time = 1 hour 29 min;
// Prague -  Wien 333 km avg = 3 hour 20 min ;
// Wien -BudaPest 243 km  2 hour 26 min;
// Budapest - Belgrade 379 km avg 3 hour 47 min ;
// Belgrade - Sofia 393km 3 hour 56 min ;
// Sofia - Instanbul 551 avg 5 hour 31 min km