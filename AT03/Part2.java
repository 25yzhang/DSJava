/*
 * Jerry Zhang
 * Mr Eng
 * AT Java
 * AT03 Part2
 */

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt user for phone number
        System.out.print("Enter a 10 digit phone number (no spaces): ");

        // declare phone number
        Long number;

        // make sure entered value is a int
        if (in.hasNextLong()) {
            number = in.nextLong();
        } else {
            System.err.println("Please enter a 10 digit phone number (no spaces)");
            return;
        }

        int first = (int) (number / 10000000);
        number = number % 10000000;
        int second = (int) (number / 10000);
        number = number % 10000;

        // format number
        System.out.printf("The formatted number is (%d) %d-%d", first, second, number);
    }
}
