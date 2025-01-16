/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 22 Part B
 */

import java.io.File;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        // open the file
        File file = new File("birthyears.txt");
        Scanner in;
        try {
            // scan in the file
            in = new Scanner(file);
        } catch (Exception FileNotFoundException) {
            System.out.println("The file was not found");
            return;
        }

        // set delimiter
        in.useDelimiter("[,\r\n]+");

        // scan in, watching out for errors
        while (in.hasNext()) {
            String name = in.next();
            String second = in.next().trim();
            try {
                int year = Integer.parseInt(second);
                System.out.printf("%s was born in %d.%n", name, year);
            } catch (Exception NumberFormatException) {
                System.out.printf("I do not know what year %s was born.%n", name);
            }
        }
        in.close();
    }
}
