/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW12 PartA
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String input = in.next();
        System.out.println("Hello, " + input);
        System.out.print("How old are you? ");
        int years = in.nextInt();
        years++;
        System.out.println("Next year, you will be " + years);
    }
}
// you are declaring two variables named input, you can only declare it once and
// it can only be one variable type. To fix this, replace input for another
// variable name