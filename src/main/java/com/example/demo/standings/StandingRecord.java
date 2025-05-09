package com.example.demo.standings;

public record StandingRecord(
        String division,
        String name,
        int w,
        int l,
        int t,
        float pct,
        int pf,
        int pa,
        int net,
        String div_wlt,
        float div_pct,
        String strk,
        String last2
) {}
