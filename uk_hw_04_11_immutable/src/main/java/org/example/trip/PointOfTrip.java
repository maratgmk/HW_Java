package org.example.trip;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

public  class PointOfTrip {
    private  String name;
    private  ZonedDateTime dateTime;

    public PointOfTrip(String name, ZonedDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public ZonedDateTime getDateTime() {
        return dateTime;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDateTime(ZonedDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "PointOfTrip{" +
                "name='" + name + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
