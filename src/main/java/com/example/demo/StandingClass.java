package com.example.demo;

public class StandingClass {
    private String division;
    private String name;

    private int w;
    private int l;
    private int t;
    private float pct;

    private int pf;
    private int pa;
    private int net;

    private String div_wlt;
    private float div_pct;

    private String strk;
    private String last2;

    public StandingClass(String division, String name, int w, int l, int t, float pct, int pf, int pa, int net, String div_wlt, float div_pct, String strk, String last2) {
        this.division = division;
        this.name = name;
        this.w = w;
        this.l = l;
        this.t = t;
        this.pct = pct;
        this.pf = pf;
        this.pa = pa;
        this.net = net;
        this.div_wlt = div_wlt;
        this.div_pct = div_pct;
        this.strk = strk;
        this.last2 = last2;
    }

    public String getDivision() {
        return division;
    }

    public String getName() {
        return name;
    }

    public int getW() {
        return w;
    }

    public int getL() {
        return l;
    }

    public int getT() {
        return t;
    }

    public float getPct() {
        return pct;
    }

    public int getPf() {
        return pf;
    }

    public int getPa() {
        return pa;
    }

    public int getNet() {
        return net;
    }

    public String getDiv_wlt() {
        return div_wlt;
    }

    public float getDiv_pct() {
        return div_pct;
    }

    public String getStrk() {
        return strk;
    }

    public String getLast2() {
        return last2;
    }
}
