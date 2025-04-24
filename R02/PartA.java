import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to test?: ");
        String word = in.nextLine();
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (isPalin(word) == true) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }

    public static boolean isPalin(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        } else if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalin(word.substring(1, word.length() - 1));
    }
}
