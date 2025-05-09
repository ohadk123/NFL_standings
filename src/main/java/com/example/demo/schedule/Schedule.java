package com.example.demo.schedule;

public class Schedule {
    private String name_home;
    private String name_away;
    private int week;
    private String day;

    public Schedule(String name_home, String name_away, int week, String day) {
        this.name_home = name_home;
        this.name_away = name_away;
        this.week = week;
        this.day = day;
    }

    public String getName_home() {
        return name_home;
    }

    public String getName_away() {
        return name_away;
    }

    public int getWeek() {
        return week;
    }

    public String getDay() {
        return day;
    }
}
