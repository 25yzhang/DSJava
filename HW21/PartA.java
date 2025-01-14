/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 21 Part A
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File unemployment = new File("unemployment.txt");
        Scanner in = new Scanner(unemployment);

        File unemploymentFormatted = new File("unemploymentFormatted.txt");
        PrintWriter out = new PrintWriter(unemploymentFormatted);

        // print header
        out.printf(
                "---------------------------------------------------------------%n                   Top 5 Unemployment Rates%n---------------------------------------------------------------%n");

        while (in.hasNextLine()) {
            String line = in.nextLine();
            Scanner currentLine = new Scanner(line);
            currentLine.useDelimiter("[,\r\n]+");

            String country = currentLine.next();
            double unemploymentRate = Double.valueOf(currentLine.next());
            int rankingValue = (int) Math.round(Double.valueOf(currentLine.next()));
            String region = currentLine.next();

            // Print rankings
            out.printf("Ranked #%3d | %17s | %5.2f%% |%s%n", rankingValue, country, unemploymentRate, region);

            currentLine.close();
        }
        in.close();
        out.close();
    }
}