import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptional {
    public static void main(String[] args) {
        // open for reading
        File inputFile = new File("missing.txt");
        Scanner in;
        try {
            // try opening the file for reading
            in = new Scanner(inputFile);
            System.out.println("File was opened successfully: ");

            while (in.hasNext()) {
                System.out.println(in.next());
            }

            in.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return;
        }
    }
}