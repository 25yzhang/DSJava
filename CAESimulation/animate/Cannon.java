package animate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import sound.SoundClip;

public class Cannon {
    // declare all member variables
    private double x;
    private double y;
    private double rotation;
    private double muzzleVelocity;
    BufferedImage cannonImage;
    private final int B_WIDTH = 1280;
    private final int B_HEIGHT = 720;
    final static int HYPOT = 100;

    // image dimensions
    final int CANNON_HEIGHT = 51;
    final int CANNON_WIDTH = 124;
    final int PIVOT_X = 15;
    final int PIVOT_Y = CANNON_HEIGHT / 2;

    // draw cannon method
    public void drawCannon(Graphics2D g2d) {
        // transform cannon
        AffineTransform transform = new AffineTransform();
        transform.translate(x, y);
        transform.rotate(Math.toRadians(rotation), PIVOT_X, PIVOT_Y);

        // draw cannon
        g2d.drawImage(cannonImage, transform, null);
        // draw circle
        g2d.setColor(Color.BLUE);
        final int CIRCLE_DIAMETER = 10;
        g2d.fillOval(60 - (CIRCLE_DIAMETER / 2), B_HEIGHT - 60 - (CIRCLE_DIAMETER / 2), 10, 10);
        // draw triangle
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(new int[] { 40, 60, 80 }, new int[] { B_HEIGHT - 20, B_HEIGHT - 60, B_HEIGHT - 20 }, 3);
        g2d.setColor(Color.PINK);
        g2d.fillPolygon(new int[] { 40, 60, 80 }, new int[] { B_HEIGHT - 20, B_HEIGHT - 60, B_HEIGHT - 20 }, 3);
    }

    // constructor method
    public Cannon() {
        try {
            // open all neccessary items
            File imageFile = new File("media/sm_cannon.png");
            cannonImage = ImageIO.read(imageFile);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // set intial values of member variables
        x = 60 - PIVOT_X;
        y = 720 - 60 - PIVOT_Y;
        rotation = -45;

        muzzleVelocity = 32;
    }

    // fire cannon
    public void fireCannon(CannonBall cannonBall) {
        if (cannonBall.getState() != CannonBall.STATE.FLYING) {
            playCannonSound();
        }

        cannonBall.launch((x + PIVOT_X) + (HYPOT * Math.cos(Math.toRadians(rotation))) - (CannonBall.BALL_DIAMETER / 2),
                (y + PIVOT_Y) + (HYPOT * Math.sin(Math.toRadians(rotation))) - (CannonBall.BALL_DIAMETER / 2),
                Math.cos(Math.toRadians(rotation)) * muzzleVelocity,
                Math.sin(Math.toRadians(rotation)) * muzzleVelocity);
    }

    // methods to play sound effects
    public void playWheelSound() {
        try {
            SoundClip wheelSound = new SoundClip("media/wheel.wav");
            wheelSound.open();
            wheelSound.play();
        } catch (Exception e) {
            System.err.println("wheelSound doesn't work");
        }
    }

    public void playCannonSound() {
        try {
            SoundClip cannonSound = new SoundClip("media/cannon.wav");
            cannonSound.open();
            cannonSound.play();
        } catch (Exception e) {
            System.err.println("cannonSound doesn't work");
        }

    }

    // rotate cannon methods
    public void rotateClockwise(double angle) {
        rotation = rotation + angle;
        playWheelSound();
        if (rotation < -90) {
            rotation = -90;
        } else if (rotation > 0) {
            rotation = 0;
        }
    }

    public void rotateCounterClockwise(double angle) {
        rotation = rotation - angle;
        playWheelSound();
        if (rotation > 0) {
            rotation = 0;
        } else if (rotation < -90) {
            rotation = -90;
        }
    }

    // methods to get and set member variables
    public double getX() {
        return x;
    }

    public void setX(double newX) {
        x = newX;
    }

    public double getY() {
        return y;
    }

    public void setY(double newY) {
        y = newY;
    }

    public double getRotation() {
        return -rotation;
    }

    public void setRotation(double newRotation) {
        rotation = newRotation;
    }

    public double getMuzzleVelocity() {
        return muzzleVelocity;
    }

    public void setMuzzleVelocity(double newMuzzleVelocity) {
        muzzleVelocity = newMuzzleVelocity;
    }
}
