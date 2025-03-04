/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * Test0304 Question 6
 */

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt for three integers
        System.out.print("Enter three integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // start sorting process with if statements covering all arrangements
        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c > b && b > a) {
            System.out.println(c + " " + b + " " + a);
        } else { // in case numbers are all equal
            System.out.println(a + " " + b + " " + c);
        }
        in.close();
    }
}
