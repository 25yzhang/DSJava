package animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel implements KeyListener {
    private final int B_WIDTH = 1280;
    private final int B_HEIGHT = 720;
    final int FLOOR = B_HEIGHT - 25;

    // declare member variable of type Cannon
    Cannon cannon = new Cannon();

    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // register Board object as a key listener
        this.setFocusable(true);
        this.addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // draw ground
        g2d.drawLine(0, FLOOR, 1600, FLOOR);
        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT);
        cannon.drawCannon(g2d);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            System.out.println("Spacebar was pressed.");
            cannon.fireCannon();
        } else if (e.getKeyCode() == 37) {
            System.out.println("Left arrow was pressed.");
            cannon.rotateCounterClockwise(10);
            repaint();
        } else if (e.getKeyCode() == 39) {
            System.out.println("Right arrow was pressed.");
            cannon.rotateClockwise(10);
            repaint();
        } else if (e.getKeyCode() == 38) {
            System.out.println("Up arrow was pressed.");
        } else if (e.getKeyCode() == 40) {
            System.out.println("Down arrow was pressed.");
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}
