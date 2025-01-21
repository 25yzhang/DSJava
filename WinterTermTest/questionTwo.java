import java.util.ArrayList;
import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner in = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        // gather test scores
        while (condition == true) {
            System.out.print("Enter a quiz score or 'q' to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.next();
                condition = false;
            } else {
                list.add(in.nextDouble());
            }
        }

        // print and calculate average
        double sum = 0;

        System.out.println("--------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%8.2f%n", list.get(i));
            sum = sum + list.get(i);
        }
        double average = sum / list.size();
        System.out.printf("--------------------%navg = %.2f%n", average);

        in.close();
    }
}
