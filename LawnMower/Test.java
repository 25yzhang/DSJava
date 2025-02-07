import java.util.Scanner;

import mow.*;

public class Test {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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
        Mower testMower = new Mower();

        // initialize yard object
        Yard testYard = new Yard(height, width);
        testYard.printYard(testMower);

        // testing various functions
        System.out.println("Now changing 0,0 to a ' '");
        testYard.cellOverride(0, 0, ' ');
        testYard.printYard(testMower);

        System.out.println("This is the height and width");
        System.out.println(testYard.returnHeight());
        System.out.println(testYard.returnWidth());
    }
}
