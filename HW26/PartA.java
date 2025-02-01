/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 26 Part A
 */

/*
 * List an example of each of the following and write a simple program that demonstrates how these items are used:
A Java-provided constant static value that is often used in mathematical and/or scientific calculations.
A Java-provided static method that is often used in mathematical and/or scientific calculations.
 */

public class PartA {
    public static void main(String[] args) {
        // Math.PI is a constant static value. Here is an example of it's use
        double radius = 1;
        double circumference = 2 * (Math.PI) * radius;

        // Math.pow is often used in many equations
        double a = 2;
        double twoSquared = Math.pow(a, 2);

        System.out.printf("The circumfrence of circle with radius 1 is %.2f%nThe value of two squared is %.2f%n",
                circumference, twoSquared);
    }
}