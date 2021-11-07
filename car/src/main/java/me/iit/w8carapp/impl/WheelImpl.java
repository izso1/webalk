package me.iit.w8carapp.impl;

import me.iit.w8carapp.Wheel;

public class WheelImpl implements Wheel {

    private final int szelesseg;
    private final int atmero;
    private final int kopenyMagassag;

    public WheelImpl(int szelesseg, int atmero, int kopenyMagassag) {
        this.szelesseg = szelesseg;
        this.atmero = atmero;
        this.kopenyMagassag = kopenyMagassag;
    }

    @Override
    public String toString() {
        return "WheelImpl { " + szelesseg + "/" + kopenyMagassag + "/" + atmero + "}";
    }
}
