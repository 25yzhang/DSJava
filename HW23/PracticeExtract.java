import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticeExtract {
    public static void main(String[] args) {
        Scanner in;
        File inputFile = new File("gdp_extract.txt");
        try {
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return;
        }
        in.useDelimiter("[;\r\n]+");

        while (in.hasNext()) {
            String country = in.next().trim();
            String incomeString = in.next().trim();
            incomeString = incomeString.replaceAll(",", "");
            String rankString = in.next().trim();
            String region = in.next().trim();

            int rank = Integer.valueOf(rankString);
            double income = Double.valueOf(incomeString);

            System.out.println(country + " " + income + " " + rank + " " + region);

        }
        in.close();
    }
}
