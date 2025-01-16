/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 22 Part A
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        String fileName;
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        while (condition == true) {
            System.out.print("Enter the file name or type # to quit: ");
            fileName = in.next();

            // return if user types "#"
            if (fileName.equals("#")) {
                System.out.println("Goodbye");
                condition = false;
            } else {

                File file = new File(fileName);
                try {
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        System.out.println(scanner.next());
                    }
                    condition = false;
                    scanner.close();
                } catch (Exception FileNotFoundException) {
                    System.out.println("File was not found");
                }
            }
        }
        in.close();
    }
}
