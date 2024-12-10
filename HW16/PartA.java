/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 16 Part A
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void dropScore(double[] list, int currentLength) {
        double smallest = Double.POSITIVE_INFINITY;
        int place = 0;
        int k = 0;
        // identify smallest value
        for (k = 0; k < currentLength; k++) {
            if (list[k] < smallest) {
                smallest = list[k];
                place = k;
            }
        }
        // move everything up in same order
        while (place < currentLength) {
            list[place] = list[place + 1];
            place = place + 1;
        }
        list[place] = 0;
    }

    public static void main(String[] args) {
        double[] scores = new double[10]; // create array
        System.out.println("Enter test scores or type 'q' to quit:");

        Scanner in = new Scanner(System.in);
        int i = 0;
        for (i = 0; i <= scores.length; i++) {
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.next();
                break;
            } else {
                scores[i] = in.nextDouble();
            }
        }

        // print original list
        System.out.println("Here is the original list: ");
        for (int l = 0; l < i; l++) {
            System.out.print(scores[l] + " | ");
        }
        System.out.println();

        System.out.print("Would you like to drop the lowest test score (y for yes, n for no): ");

        if (in.hasNext("y") || in.hasNext("Y")) {
            in.next();
            double[] scoresCopy = scores;
            dropScore(scoresCopy, i);

            // print dropped list
            System.out.println("Here is the edited list: ");
            for (int l = 0; l < i - 1; l++) {
                System.out.print(scores[l] + " | ");
            }
            System.out.println();
        }
    }
}
