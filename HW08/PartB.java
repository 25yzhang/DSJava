/*
 * Jerry Zhang
 * Mr Eng
 * AT Java
 * HW08 PartB
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // get interest rate
        System.out.print("Enter the APR (as a percentage, for example, 5.5): ");
        Double APR = in.nextDouble();

        // get initial balance
        System.out.print("Enter the balance: ");
        Double balance = in.nextDouble();

        // declare latest balance before each year's new balance
        Double last = balance;

        System.out.printf(
                "Year |        Int Earned ($)       |           Balance ($)%n----------------------------------------------------------------------%n");
        for (int i = 1; i < 6; i++) {
            Double interest = (APR / 100) + 1;
            balance = balance * interest;
            Double earned = balance - last;
            last = balance;
            System.out.printf("%3d  |%29.2f |%29.2f   %n", i, earned, balance);
        }
        in.close();
    }
}
