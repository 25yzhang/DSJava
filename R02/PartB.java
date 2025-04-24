import java.util.Scanner;

public class PartB {
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
        if (word.length() <= 1) {
            return true;
        } else {
            for (int i = 0; i < (word.length() / 2) - 1; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
