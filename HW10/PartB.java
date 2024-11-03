/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW10 PartA
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cookies: ");
        int num = in.nextInt();
        Double discount = 0.00;
        if (num > 12) {
            discount = 0.10;
        } else if (num > 6) {
            discount = 0.05;
        }
        System.out.println("Discount = " + discount);
    }
}

// this is a compile time error. Because discount is not assigned with a number
// and the only assignment occurs if number satisfies a certain condition,
// discount may never have double, so it can't be used in math equations. To fix
// this, you can set discount to 0 to begin with. Also, there is a logic error.
// We want if statements to be in order of most to least selective. The current
// code assigns all cookies above 6 (including above 12) to discount = 0.05. To
// fix this, switch the order of the if statements