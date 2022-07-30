package org.jxiang.oopBasics;

public class Demo {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(
                20,
                20,
                1);
        System.out.println(mb);
        System.out.println("Seat Height: "+ mb.getSeatHeight());
        mb.applyBrake(1);
        System.out.println("bike speed after applying brake is " + mb.speed);

        Bicycle mb2 = new MountainBike(
                20,
                20,
                1);

        System.out.println(mb.equals(mb2));
    }
}
