import mow.*;
import java.util.Scanner;

public class LineByLine {
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

        while (testMower.detectGrass(testYard) == false) {
            testMower.setDirection(testMower.getDirection() + 1);
        }

        System.out.print("Do you want to cut the yard in a (S)prial pattern or (L)ine-by-line?: ");

        if (in.hasNext("s") || in.hasNext("S")) {
            in.next();
            // enter into sprial program
            // cut initial piece of grass
            testMower.cutGrass(testYard);
            while (testMower.detectGrass(testYard) == true) {
                delay(500);
                clearScreen();
                testMower.moveForward();
                testYard.printYard(testMower);
                testMower.cutGrass(testYard);
                if (testMower.detectGrass(testYard) == false) {
                    while (testMower.detectGrass(testYard) == false) {
                        testMower.setDirection(testMower.getDirection() + 1);
                        if (testMower.checkAvailableGrass(testYard) == false) { // no more grass
                            System.out.println("All Grass Successfully Cut!");
                            break;
                        }
                    }
                }
            }
        } else if (in.hasNext("l") || in.hasNext("L")) {
            in.next();
            // enter into sprial program
            // cut initial piece of grass
            testMower.cutGrass(testYard);
            while (testMower.detectGrass(testYard) == true) {
                delay(500);
                clearScreen();
                testMower.moveForward();
                testYard.printYard(testMower);
                testMower.cutGrass(testYard);
                if (testMower.detectGrass(testYard) == false) {
                    // if current direction is 0-3, turn accordingly, cut, then turn again
                    // accordingly
                    if (testMower.getDirection() == 0) {

                    }

                    if (testMower.checkAvailableGrass(testYard) == false) { // no more grass
                        System.out.println("All Grass Successfully Cut!");
                        break;
                    }
                }
            }
        }
    }
}
