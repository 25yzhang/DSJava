/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW13 PartC 
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartC {
    public static void draw(Graphics g) {
        // declare all constants, makes program easy to adjust
        final double SCALE = 150;
        final int STEPS = 100000;
        final int ORIGINCENTER = 200;
        final int SIZE = 1;

        // declare variables used in loop
        double radius;
        double xCoords;
        double yCoords;

        double degreeDistance = 2 * Math.PI / STEPS;

        for (double degree = 0; degree < 2 * Math.PI; degree = degree + degreeDistance) {
            radius = Math.cos(2 * degree);
            xCoords = radius * Math.cos(degree) * SCALE;
            yCoords = radius * Math.sin(degree) * SCALE;

            g.setColor(Color.BLACK);

            g.fillOval((int) xCoords + ORIGINCENTER, (int) yCoords + ORIGINCENTER, SIZE, SIZE);
        }
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}
