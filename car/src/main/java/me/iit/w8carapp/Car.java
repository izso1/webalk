package me.iit.w8carapp;

public class Car {

    private final Wheel[] wheels;
    private final Motor motor;
    private final String tipus;

    public Wheel[] getWheels() {
        return wheels;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getTipus() {
        return tipus;
    }

    public Car(Wheel[] wheels, Motor motor, String tipus) throws NotRightData {
        if (wheels.length != 4 || motor == null || tipus == null) {
            throw new NotRightData();
        }
        this.wheels = wheels;
        this.motor = motor;
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Car { " +
                "wheels = " + wheels[0].toString() +
                ", motor = " + motor +
                ", tipus = " + tipus + "\"" + " }";
    }

}
