/*
 * Jerry Zhang
 * Mr Eng
 * AT Java
 * HW 20 Part B
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("partB.txt");
        Scanner in = new Scanner(file);
        in.useDelimiter("");

        int letterCount = 0;
        int digitCount = 0;
        int charCount = 0;
        while (in.hasNext()) {
            String letter = in.next();
            if (Character.isLetter(letter.charAt(0)) == true) {
                letterCount = letterCount + 1;
            }
            if (Character.isDigit(letter.charAt(0)) == true) {
                digitCount = digitCount + 1;
            }
            charCount = charCount + 1;
            System.out.print(letter);
        }

        System.out.printf("%ncount = %d%nletters = %d%ndigits = %d%n", charCount, letterCount, digitCount);
        in.close();
    }
}