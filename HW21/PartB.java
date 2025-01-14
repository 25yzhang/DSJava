/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 21 Part A
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("salesByCat.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\r\n]+");

        while (in.hasNext()) {
            String deptName = in.next().trim();
            String managerName = in.next().trim();
            String revenueString = in.next().trim();
            double revenue;
            if (revenueString.equals("n/a")) {
                revenue = 0.0;
            } else {
                revenue = Double.valueOf(revenueString);
            }
            System.out.printf("%-18s| %-11s| $%10.2f%n", deptName, managerName, revenue);
        }
        in.close();
    }
}
