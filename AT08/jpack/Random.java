package jpack;

public class Random {
    public static int getRandomInteger(int upper) {
        double r = Math.random() * upper;
        int val = (int) r + 1;
        return val;
    }
}