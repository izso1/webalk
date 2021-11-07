package me.iit.w8carapp.impl;

import me.iit.w8carapp.Motor;

public class BelsoegesuMotor implements Motor {

    private final int loero;
    private final int ccn;

    public BelsoegesuMotor(int loero, int ccn) {
        this.loero = loero;
        this.ccn = ccn;
    }

    @Override
    public String toString() {
        return "MotorImpl { " +
                "loero = " + loero +
                ", ccn = " + ccn + "}";
    }
}
