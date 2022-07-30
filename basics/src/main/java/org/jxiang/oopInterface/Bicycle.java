package org.jxiang.oopInterface;

/**
 * what should be included in interface?
 * 1. method declarations to be implemented
 * 2. public static final variables
 */

public interface Bicycle {

    String BRAND = "xjy";

    void applyBrake(int decrement);
    void speedUp(int increment);
}
