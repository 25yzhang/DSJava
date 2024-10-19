/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW08 PartA
 */

public class PartA {
    public static void main(String[] args) {
        double i = 100;
        int years = 0;
        while (i > 1) {
            i = i / 2;
            years = years + 30;
        }
        System.out.println("It will take " + years + " years to have " + i + "% Cesium 90 remaining");
    }
}