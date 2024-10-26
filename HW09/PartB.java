/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW09 PartB
 */

import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();
        int count = 0;
        for (int i = phrase.length(); i > 0; i--) {
            char character = phrase.charAt(i - 1);
            if (character == 'e') {
                count = count + 1;
            }
        }
        System.out.println("The total number of e's is " + count);
    }
}
