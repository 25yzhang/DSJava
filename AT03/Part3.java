/*
 * Jerry Zhang
 * Mr Eng
 * AT Java
 * AT03 Part3
 */

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        // initialize new scanner and number
        Scanner in = new Scanner(System.in);
        int number;

        // make sure number is positive and an integer
        System.out.print("Enter a positive integer: ");
        if (in.hasNextInt()) {
            number = in.nextInt();
            if (number < 1) {
                System.err.println("Enter a positive integer please.");
                return;
            }
        } else {
            System.err.println("Enter a positive integer please.");
            return;
        }

        // check if number is 1
        if (number == 1) {
            System.out.println(number + " is not prime");
            return;
        }

        // check if number is divisible by more than 1 and itself
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                System.out.println(number + " is not prime");
                return;
            }
        }
        // if not, its prime
        System.out.println(number + " is prime");
    }
}
