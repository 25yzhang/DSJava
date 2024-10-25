/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT05 Part B
 */

import java.util.Scanner;

class DimmableLight {
    int brightness = 0;
    boolean status = false;

    public int viewBrightness() {
        while (brightness > 10) {
            brightness = brightness - 1;
        }
        while (brightness < 1) {
            brightness = brightness + 1;
        }
        return brightness;
    }

    public boolean viewStatus() {
        return status;
    }

    public void turnOn() {
        status = true;
    }

    public void turnOff() {
        status = false;
    }

    public void brighter() {
        brightness = brightness + 1;
    }

    public void dimmer() {
        brightness = brightness - 1;
    }
}

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // create new dimmable light object
        DimmableLight light = new DimmableLight();

        // print options
        System.out.println(
                "Enter: 'view' to return current state & brightness | 'on/off' to turn on/off the lightbulb | 'up/down' to increase/decrease lightbulb brightness (1-10) | 'q' to quit");
        while (true) {
            System.out.print("Enter input: ");
            String input = in.nextLine();

            if (input.equals("view")) {
                light.viewBrightness();
                light.viewStatus();
                if (light.viewStatus() == true) {
                    System.out.print("The light is currently on and it's brightness is " + light.viewBrightness());
                } else {
                    System.out.print("The light is currently off");
                }
            }
            if (input.equals("on")) {
                light.turnOn();
                System.out.print("The light is now on");
            }
            if (input.equals("off")) {
                light.turnOff();
                System.out.print("The light is now off");
            }
            if (input.equals("q")) {
                System.out.println("Cya later!");
                break;
            }
            if (input.equals("up")) {
                light.brighter();
                System.out.print("The light's brightness is now " + light.viewBrightness());
            }
            if (input.equals("down")) {
                light.dimmer();
                System.out.print("The light's brightness is now " + light.viewBrightness());
            }
            // new line
            System.out.println();
        }
    }
}
