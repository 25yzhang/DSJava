/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * Hw12 PartB
 */

import java.util.Scanner;

public class PartB {
    public static double smallest(double a, double b, double c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter three doubles: ");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double smallestVal = smallest(x, y, z);
        System.out.println(smallestVal);
    }
}
