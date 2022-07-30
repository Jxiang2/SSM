package org.jxiang.oopBasics;

class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear) {
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return this.gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public String toString() {
        return String.format(
                "Bike gear is %s and speed is %d",
                this.getGear(),
                this.getSpeed());
    }
}
