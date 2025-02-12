import mow.*;
import java.util.Scanner;

public class SideToSideCutDemo {
    // clear screen function
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // delay function
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    }

    public static void main(String[] args) {
        // request height and width of yard
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height of the yard: ");
        int height = in.nextInt();
        System.out.print("Enter the width of the yard: ");
        int width = in.nextInt();

        // clear screen
        clearScreen();

        // initialize yard object
        Yard testYard = new Yard(height, width);

        // initialize mower object and set to random corner
        Mower testMower = new Mower();
        testMower.randomCorner(testYard);

        while (testMower.updateMower(testYard) == true) {
            delay(500);
            clearScreen();
            testMower.updateMower(testYard);
            testMower.cutGrass(testYard);
            testYard.printYard(testMower);
        }
    }
}
