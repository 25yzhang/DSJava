import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeProblem {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("practice_example.txt");
        Scanner in = new Scanner(inputFile);
        ArrayList<Integer> list = new ArrayList<>();
        int highest = Integer.MIN_VALUE;

        while (in.hasNext()) {
            int value = in.nextInt();
            list.add(value);
            if (value > highest) {
                highest = value;
            }
        }

        File outputFile = new File("out_A.txt");
        PrintWriter out = new PrintWriter(outputFile);

        for (int j = 0; j < list.size(); j++) {

            out.printf("value #%03d:%5d", j, list.get(j));
            if (list.get(j) == highest) {
                out.print(" <== highest");
            }
            out.println();
        }
        in.close();
        out.close();
    }
}
