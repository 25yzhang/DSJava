/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 19 Part B
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        // initialize files
        File inputFile = new File("quizzes.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scoresFormatted.txt");
        PrintWriter out = new PrintWriter(outputFile);

        // initialize constants
        int quizNumber = 0;
        double total = 0;

        // print body of txt
        while (in.hasNext()) {
            double score = in.nextDouble();
            out.printf("Quiz %03d: %6.2f%n", quizNumber, score);
            quizNumber = quizNumber + 1;
            total = total + score;
        }
        // print ending
        double average = total / quizNumber;
        out.printf("----------------%nAverage: %6.2f", average);

        // close
        in.close();
        out.close();
    }
}
