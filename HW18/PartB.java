/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 18 Part B
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<Double>();

        System.out.println("Enter test scores or type 'q' to quit: ");

        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                condition = false;
            } else {
                scores.add(in.nextDouble());
            }
        }

        for (int j = 0; j < scores.size(); j++) {
            System.out.printf("%.2f%n", scores.get(j));
        }
    }
}
