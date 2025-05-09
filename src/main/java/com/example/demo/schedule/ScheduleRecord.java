package com.example.demo.schedule;

public record ScheduleRecord(
        String nameHome,
        String recordHome,
        String nameAway,
        String recordAway,
        int week,
        String day
) {}
