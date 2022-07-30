package org.jxiang.oopBasics;

class MountainBike extends Bicycle {

    private int seatHeight;

    public MountainBike(
            int startHeight,
            int startSpeed,
            int startGear) {
        // super instantiate base class
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return this.seatHeight;
    }

    @Override
    public String toString() {
        return String.format(
                "Bike gear is %s, speed is %d and seat height is %d",
                this.getGear(),
                this.getSpeed(),
                this.getSeatHeight());
    }
}
