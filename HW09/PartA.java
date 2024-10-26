
/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW09 PartA
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter double values only, enter a negative value to quit and get results");
        double value;
        double total = 0;
        double number = 0;
        do {
            System.out.print("Enter a test score: ");
            value = in.nextDouble();
            if (value >= 0) {
                total = total + value;
                number = number + 1;
            }
        } while (value >= 0);
        double average = total / number;
        System.out.println("You entered " + (int) number + " scores, with the average being " + average);
    }
}