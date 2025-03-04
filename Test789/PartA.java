import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        File outputFile = new File("organizedCustomerData.txt");
        PrintWriter out = new PrintWriter(outputFile);

        in.useDelimiter("[,\s]+");
        while (in.hasNext()) {
            int ID = in.nextInt();
            String name = in.next();
            double balance = Double.parseDouble(in.next());
            out.printf("%06d | %-12s | %f%n", ID, name, balance);
        }
        out.close();
        in.close();
    }
}