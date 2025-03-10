package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    private int x = 0;
    private int y = 0;

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private int xSpeed = 1;
    private int ySpeed = 1;
    private int angle = 0;

    private BufferedImage img;

    private class ScheduledUpdate extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {
            x += xSpeed;
            y += ySpeed;
            angle += 5;

            if (x > B_WIDTH) {
                x = 0;
                y = 0;
            }
            if (angle > 360) {
                angle = 0;
            }
            repaint();
        }
    }

    public Board() {
        // set background color of the board and default size.
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {
            File imageFile = new File("media/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(),
                INITIAL_DELAY, PERIOD_INTERVAL);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        AffineTransform affineTransform = new AffineTransform();
        Graphics2D g2d = (Graphics2D) g;

        if (img != null) {
            affineTransform.translate(x, y);
            affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }
}
