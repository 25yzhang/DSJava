package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 350;
    private final int B_HEIGHT = 350;

    // Constructor
    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
    }

    private final int SIDE_LEN = 150;

    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.MAGENTA);

        // translate in the x and y directions.
        int x_t = B_WIDTH / 2;
        int y_t = B_HEIGHT / 2;
        x_t = x_t - SIDE_LEN / 2;
        y_t = y_t - SIDE_LEN / 2;
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.rotate(Math.toRadians(22.5), x_t, y_t);

        // get the transformed shape.
        Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transformedShape = affineTransform.createTransformedShape(rect);

        // draw the transformed shape on the screen.
        g2d.setColor(Color.MAGENTA);
        g2d.fill(transformedShape);

        g2d.setColor(Color.BLUE);
        g2d.drawString("Hello, world!", 20, 20);
    }

    public static void main(String[] args) {
        Application myApp = new Application("Title");
        myApp.setVisible(true);

    }
}
