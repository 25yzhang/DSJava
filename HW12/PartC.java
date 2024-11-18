/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW12 PartC
 */

import java.util.Scanner;

public class PartC {
    public static boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // prompt for a phrase
        System.out.print("Enter a phrase: ");
        Scanner in = new Scanner(System.in);
        // declare variables
        int count = 0;
        String phrase = in.nextLine();
        int i = phrase.length();
        for (i = 0; i <= phrase.length() - 1; i++) {
            char character = phrase.charAt(i);
            if (isVowel(character) == true) {
                count = count + 1;
            }
        }
        System.out.println("There are " + count + " vowels in the phrase.");
    }
}
