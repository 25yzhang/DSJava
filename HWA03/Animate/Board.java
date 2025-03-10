package Animate;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sound.SoundClip;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Board extends JPanel {
    private final int B_WIDTH = 720;
    private final int B_HEIGHT = 720;
    // get random starting position and angle
    private int x = (int) (Math.random() * 720);
    private int y = (int) (Math.random() * 720);

    private Timer timer;
    private final int INITIAL_DELAY = 100;
    private final int PERIOD_INTERVAL = 25;
    private final int ORIGINAL_X_SPEED = (int) (Math.random() * 5) + 1;
    private final int ORIGINAL_Y_SPEED = (int) (Math.random() * 5) + 1;
    private int xSpeed = ORIGINAL_X_SPEED;
    private int ySpeed = ORIGINAL_Y_SPEED;
    private int angle = 0;

    private BufferedImage img;

    private class ScheduledUpdate extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */

        public void run() {
            try {
                SoundClip ow = new SoundClip("media/ow.wav");
                ow.open();
                if (y > 720) {
                    ySpeed = -ORIGINAL_Y_SPEED;
                    ow.play();
                } else if (y < 0) {
                    ySpeed = ORIGINAL_Y_SPEED;
                    ow.play();
                } else if (x > 720) {
                    xSpeed = -ORIGINAL_X_SPEED;
                    ow.play();
                } else if (x < 0) {
                    xSpeed = ORIGINAL_X_SPEED;
                    ow.play();
                }
                x += xSpeed;
                y += ySpeed;
                angle += 5;

                if (angle > 360) {
                    angle = 0;
                }
                repaint();
            } catch (Exception e) {
                System.err.println("Can't open ow file");
            }
        }
    }

    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // try opening image
        try {
            File imageFile = new File("media/Andy.png");
            img = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // initiate timer object
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduledUpdate(), INITIAL_DELAY, PERIOD_INTERVAL);
    }

    public void paintComponent(Graphics g) {
        // default stuff
        super.paintComponent(g);
        AffineTransform affineTransform = new AffineTransform();
        Graphics2D g2d = (Graphics2D) g;

        // transformations of image
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
