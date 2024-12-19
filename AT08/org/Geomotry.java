package org; //org.derryfield.math not working, changed into just org for now

public class Geomotry {
    public static double calcVolSphere(double r) {
        double volume = (4.0 / 3) * Math.PI * (r * r * r);
        return volume;
    }

    public static double calcSurfSphere(double r) {
        double surf = 4 * Math.PI * (r * r);
        return surf;
    }
}