package Animate;

import javax.swing.JPanel;
import sound.SoundClip;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Board extends JPanel implements KeyListener, MouseListener {
    private final int B_WIDTH = 400;
    private final int B_HEIGHT = 400;
    private final int SIDE_LEN = 20;

    private int xCord = (B_WIDTH / 2) - (SIDE_LEN / 2);
    private int yCord = (B_HEIGHT / 2) - (SIDE_LEN / 2);

    private void playBlip() {
        try {
            SoundClip blip = new SoundClip("media/blip.wav");
            blip.open();
            blip.play();
        } catch (Exception error) {
            System.err.println("Can't open blip");
        }
    }

    private void playBlop() {
        try {
            SoundClip blop = new SoundClip("media/blop.wav");
            blop.open();
            blop.play();
        } catch (Exception error) {
            System.err.println("Can't open blip");
        }
    }

    // Invoked when a key has been pressed.
    public void keyPressed(KeyEvent e) {
        playBlip();
        if (e.getKeyCode() == 32) {
            playBlop();
            xCord = (B_WIDTH / 2) - (SIDE_LEN / 2);
            yCord = (B_HEIGHT / 2) - (SIDE_LEN / 2);
            repaint();
        }
    }

    public void mousePressed(MouseEvent e) {
        playBlip();
        xCord = e.getX() - (SIDE_LEN / 2);
        yCord = e.getY() - (SIDE_LEN / 2);
        repaint();
    }

    // Invoked when a key has been typed.
    public void keyTyped(KeyEvent e) {
    }

    // Invoked when a key has been released.
    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public Board() {
        // set background color of the board and default size.
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // make our panel focusable
        this.setFocusable(true);

        // register ourself as a keylistener
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.MAGENTA);

        // draw the transformed shape on the screen.
        g2d.setColor(Color.MAGENTA);
        g2d.fillOval(xCord, yCord, SIDE_LEN, SIDE_LEN);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
    }
}
