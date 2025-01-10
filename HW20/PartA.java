/*
 * Jerry Zhang
 * Mr Eng
 * AT Java
 * HW 20 Part A
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter(",\\s*|\\n");

        File outputFile = new File("formattedCustomerData.txt");
        PrintWriter out = new PrintWriter(outputFile);

        out.printf(
                "---------------------------------------%n   ID  |    Name     |     Balance %n---------------------------------------%n");

        while (in.hasNext()) {
            out.printf("%06d |", in.nextInt());
            out.printf("%12s |", in.next());
            out.printf(" $%,15.2f%n", Double.parseDouble(in.next()));
        }

        in.close();
        out.close();
    }
}
