/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 18 Part C
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> temperatures = new ArrayList<Integer>();

        System.out.println("Enter temperatures or type 'q' to quit: ");

        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                condition = false;
            } else {
                temperatures.add(in.nextInt());
            }
        }

        int smallest = Integer.MAX_VALUE;

        for (int j = 0; j < temperatures.size(); j++) {
            System.out.print(temperatures.get(j));
            if (temperatures.get(j) < smallest) {
                smallest = temperatures.get(j);
                System.out.print("<= lowest");
            }
            System.out.println();
        }

    }
}