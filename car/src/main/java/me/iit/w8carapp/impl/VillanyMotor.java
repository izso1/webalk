package me.iit.w8carapp.impl;

import me.iit.w8carapp.Motor;

public class VillanyMotor implements Motor {

    private final int teljesitmeny;
    private final int feszultseg;

    public VillanyMotor(int teljesitmeny, int feszultseg) {
        this.teljesitmeny = teljesitmeny;
        this.feszultseg = feszultseg;
    }

    @Override
    public String toString() {
        return "VillanyMotor{ " +
                "teljesitmeny = " + teljesitmeny +
                ", feszultseg = " + feszultseg + "}";
    }
}
