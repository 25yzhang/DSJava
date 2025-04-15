package animate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CannonBall {
    // declare member variables
    private double x;
    private double y;
    private double vx;
    private double vy;
    private double ax;
    private double ay;

    private double timeScale;
    private STATE currentState = STATE.IDLE;
    private double ground;
    public static final int BALL_DIAMETER = 20;

    public static enum STATE {
        IDLE,
        FLYING,
        EXPLODING
    }

    public CannonBall(double ax, double ay, double ground) {
        this.ax = ax;
        this.ay = ay;
        this.ground = ground;
    }

    public void draw(Graphics2D g2d) {
        if (currentState == STATE.FLYING) {
            g2d.setColor(Color.RED);
            g2d.fillOval((int) x, (int) y, BALL_DIAMETER, BALL_DIAMETER);
        } else if (currentState == STATE.EXPLODING) {
            try {
                File imageFile = new File("media/flame01.png");
                BufferedImage flameImage1 = ImageIO.read(imageFile);
                AffineTransform transform = new AffineTransform();
                transform.translate(x, y - 35);
                g2d.drawImage(flameImage1, transform, null);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void updateBall() {
        if (currentState == STATE.FLYING) {
            vx = vx + ax;
            vy = vy + ay;
            x = x + vx;
            y = y + vy;
        }

        if (y >= ground) {
            currentState = STATE.EXPLODING;
        }
    }

    /*
     * If the ball is not flying through the air, the launch() method
     * will change the state to FLYING and start the ball moving from position (x,y)
     * with the inital velocity of (vx, vy).
     */
    public void launch(double x, double y, double vx, double vy) {
        if (currentState != STATE.FLYING) {
            currentState = STATE.FLYING;
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
        }
    }

    /*
     * Get/set methods for the private member variables.
     */
    public STATE getState() {
        return currentState;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVX() {
        return vx;
    }

    public double getVY() {
        return vy;
    }

    public double getAX() {
        return ax;
    }

    public double getAY() {
        return ay;
    }

    public double getTimeScale() { //
        return timeScale;
    }

    public double getGround() { //
        return ground;
    }

    public void setState(STATE newState) { //
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVX(double vx) {
        this.vx = vx;
    }

    public void setVY(double vy) {
        this.vy = vy;
    }

    public void setAX(double ax) {
        this.ax = ax;
    }

    public void setAY(double ay) {
        this.ay = ay;
    }

    public void setTimeScale(double timeScale) { //
        this.timeScale = timeScale;
    }

    public void changeTimeScale(double delta) { //
        this.timeScale = this.timeScale + delta;
    }

    public void setGround(double ground) { //
        this.ground = ground;
    }

}