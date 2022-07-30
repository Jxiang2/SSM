package org.jxiang.oopInterface;

public class CityBike implements Bicycle {

    private int seatHeight;
    private int gear;
    private int speed;
    private static int numberOfCityBike = 0;

    public CityBike(int startHeight, int startSpeed, int startGear) {
        this.seatHeight = startHeight;
        this.speed = startSpeed;
        this.gear = startGear;
        numberOfCityBike ++;
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
                "%s City bike gear is %s, speed is %d and seat height is %d | total production : %d",
                BRAND,
                this.getGear(),
                this.getSpeed(),
                this.getSeatHeight(),
                numberOfCityBike
        );
    }
}