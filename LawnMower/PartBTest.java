import mow.*;
import java.util.Scanner;

public class PartBTest {
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

        // initialize mower object
        Mower testMower = new Mower(2, 0, 1);
        // !! Sample program must have a length of at least 3 for overloaded mower
        // constructor to work

        // initialize yard object
        Yard testYard = new Yard(height, width);

        // loop to cut across the field
        boolean condition = true;
        while (condition == true) {
            clearScreen();
            testMower.cutGrass(testYard);
            testYard.printYard(testMower);
            if (testMower.detectGrass(testYard) == true) {
                testMower.moveForward();
                delay(500);
            } else {
                condition = false;
            }
        }
    }
}
