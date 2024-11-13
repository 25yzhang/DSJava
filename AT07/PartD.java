
/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW09 PartD
 */
import java.util.Random;
import java.util.Scanner;

class Dice {
    // external object can interact by: looking at it, rolling it
    Random random = new Random();
    int number;
    String display;

    // roll dice
    public void roll() {
        number = random.nextInt(1, 7);
    }

    // view dice
    public String view() {
        if (number == 1) {
            display = ("+-------+\r\n" + //
                    "|       |\r\n" + //
                    "|   0   |\r\n" + //
                    "|       |\r\n" + //
                    "+-------+");
        } else if (number == 2) {
            display = ("+-------+\r\n" + //
                    "| 0     |\r\n" + //
                    "|       |\r\n" + //
                    "|     0 |\r\n" + //
                    "+-------+");
        } else if (number == 3) {
            display = ("+-------+\r\n" + //
                    "| 0     |\r\n" + //
                    "|   0   |\r\n" + //
                    "|     0 |\r\n" + //
                    "+-------+");
        } else if (number == 4) {
            display = ("+-------+\r\n" + //
                    "| 0   0 |\r\n" + //
                    "|       |\r\n" + //
                    "| 0   0 |\r\n" + //
                    "+-------+");
        } else if (number == 5) {
            display = ("+-------+\r\n" + //
                    "| 0   0 |\r\n" + //
                    "|   0   |\r\n" + //
                    "| 0   0 |\r\n" + //
                    "+-------+");
        } else if (number == 6) {
            display = ("+-------+\r\n" + //
                    "| 0   0 |\r\n" + //
                    "| 0   0 |\r\n" + //
                    "| 0   0 |\r\n" + //
                    "+-------+");
        }
        return display;
    }

}

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dice dice = new Dice();
        while (true) {
            System.out.print("Enter 'r' to roll, 'd' to display, or 'q' to quit: ");
            String command = in.nextLine();
            // quit
            if (command.equals("q")) {
                System.out.println("Cya later!");
                break;
            }
            // roll
            if (command.equals("r")) {
                dice.roll();
            }
            // display value
            if (command.equals("d")) {
                System.out.println(dice.view());
            }
        }
    }
}