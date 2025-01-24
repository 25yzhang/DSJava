import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Methods
        Scanner in = new Scanner(System.in);
        System.out.print("Double function: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double average = Average(x, y);
        System.out.println(average);
        System.out.print("Int function: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int difference = Difference(a, b);
        System.out.println(difference);

        // Arrays and Array Lists
        int[] integerArray = new int[5];
        double[] doubleArray = { 0.5, 3.14, 8.67 };

        // File Input and Output

        // If you open a file for reading that doesn't exit, the program will throw the
        // error FileNotFound. If the program doesn't have a way to deal with the error,
        // the program may crash. Methods to handle this error includes either including
        // a throws FileNotFoundException that passes the error alongor implementing a
        // try catch statement to handle it

        // When you are using the PrintWriter class to write in a file that does not
        // exist, PrintWriter can open the file for you
    }

    public static double Average(double a, double b) {
        double sum = a + b;
        double average = sum / 2.0;
        return average;
    }

    public static int Difference(int a, int b) {
        int difference = a - b;
        return difference;
    }
}