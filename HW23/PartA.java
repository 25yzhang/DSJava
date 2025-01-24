/*
 * Write a public static method that asks the user to enter quiz scores ranging
 * from 0 to 100
 * Scan in the quiz score as an integer value.
 * Pass an input Scanner as an argument to your method.
 * If the user does not provide a value in the allowed range, throw an
 * ArithmeticException.
 * Write a sample program that demonstrates how your method works and that uses
 * a try-catch statement to check whether or not a valid quiz score was
 * obtained.
 */

import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a test score: ");
        try {
            int score = getQuizScore(in);
            System.out.println("score = " + score);
        } catch (Exception e) {
            System.err.println("an error occurred!");
            System.out.println(e.getMessage());
        }

    }

    public static int getQuizScore(Scanner in) {
        try {
            int score = in.nextInt();
            return score;
        } catch (Exception e) {
            throw new ArithmeticException("Number must be an integer");
        }
    }
}
