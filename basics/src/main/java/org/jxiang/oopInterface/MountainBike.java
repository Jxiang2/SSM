package org.jxiang.oopInterface;

public class MountainBike implements Bicycle {

    private int seatHeight;
    private int gear;
    private int speed;
    private static int numberOfMountainBike = 0;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        this.seatHeight = startHeight;
        this.speed = startSpeed;
        this.gear = startGear;
        numberOfMountainBike ++;
    }

    public int getGear() {
        return gear;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    @Override
    public String toString() {
        return String.format(
                "%s Mountain bike gear is %s, speed is %d and seat height is %d | total production : %d",
                BRAND,
                this.getGear(),
                this.getSpeed(),
                this.getSeatHeight(),
                numberOfMountainBike
        );
    }
}
