import java.util.Scanner;

public class InClasse {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] scores = new double[LENGTH];
        Scanner in = new Scanner(System.in);
        int amount = 0;
        while (amount < scores.length) {
            System.out.println("Enter a double value or type q to quit");
            if (in.hasNextDouble()) {
                scores[amount] = in.nextDouble();
            } else if (in.hasNext("Q") || in.hasNext("q")) {
                in.next();
                break;
            } else {
                System.out.println("Enter a double value or type q to quit");
            }
            amount++;
        }
        System.out.println(amount);
        System.out.println("-------------------------");
        for (int i = 1; i <= amount; i++) {
            System.out.printf(" Test #%03d: %6.2f%n", i, scores[i - 1]);
        }
        System.out.println("-------------------------");
    }
}
