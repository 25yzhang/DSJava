import java.util.Scanner;

import mow.Yard;

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

        // initialize yard object
        Yard testYard = new Yard(height, width);
        testYard.printYard();

        // testing various functions
        System.out.println("Now changing 0,0 (brick) to a ' '");
        System.out.println(testYard.returnStatus(0, 0));
        testYard.cellOverride(0, 0, ' ');
        System.out.println(testYard.returnStatus(0, 0));

        System.out.println("This is the height and width");
        System.out.println(testYard.returnHeight());
        System.out.println(testYard.returnWidth());
    }
}
