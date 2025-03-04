import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("Test789/characters.txt");
        Scanner in = new Scanner(inputFile);
        File outputFile = new File("organizedCustomerData.txt");
        PrintWriter out = new PrintWriter(outputFile);

        in.useDelimiter("");
        int count = 0;
        while (in.hasNext()) {
            out.print(in.next());
            count++;
        }
        out.printf("%n%d", count);
        out.close();
        in.close();
    }
}
