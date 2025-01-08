/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 19 Part A
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        // create array list
        ArrayList<Double> temps = new ArrayList<Double>();

        // scan file in
        File list = new File("tmps.txt");
        Scanner in = new Scanner(list);
        while (in.hasNext()) {
            temps.add(in.nextDouble());
        }

        // find the smallest value in arraylist
        double smallest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < temps.size(); i++) {
            if (temps.get(i) < smallest) {
                smallest = temps.get(i);
            }
        }
        // print list
        for (int i = 0; i < temps.size(); i++) {
            System.out.printf("%3.0f", temps.get(i));
            if (temps.get(i) == smallest) {
                System.out.print(" <= lowest");
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
