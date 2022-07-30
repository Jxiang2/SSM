package org.jxiang.oopInterface;

public class Demo {
    public static void main (String[] args) {
        MountainBike mb = new MountainBike(20, 10, 1);
        System.out.println(mb);

        mb.applyBrake(1);
        mb.speedUp(2);
        System.out.println(mb);


        CityBike cb = new CityBike(20, 10, 1);
        System.out.println(cb);

        cb.applyBrake(1);
        cb.speedUp(2);
        System.out.println(cb);

        CityBike cb1 = new CityBike(20, 10, 1);
        System.out.println(cb1);

    }
}
