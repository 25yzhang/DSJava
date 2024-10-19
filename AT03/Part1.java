/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT03 Part 1
 */

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // declare price
        double price;

        // prompt user for price
        System.out.print("Enter a price in dollars and cents format: ");
        if (in.hasNextDouble()) {
            price = in.nextDouble();
        } else {
            System.err.println("Please enter a number");
            return;
        }

        int dollars = (int) price;
        double cents = Math.round((price % 1) * 100);

        System.out.printf("You have %d dollars and %.0f cents", dollars, cents);
    }
}