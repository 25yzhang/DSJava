package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private final int B_WIDTH = 300;
    private final int B_HEIGHT = 300;
    private BufferedImage img;

    // Constructor
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        try {
            File imageFile = new File("media/derryfield.jpg");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        AffineTransform affineTransform = new AffineTransform();

        int x_t = 0, y_t = 0;
        double scale = 0.5;

        if (img != null) {
            x_t = this.getWidth() / 2;
            y_t = this.getHeight() / 2;
            affineTransform.translate(img.getWidth() / 2, img.getHeight() / 2);
            affineTransform.scale(scale, scale);
            g2d.drawImage(img, affineTransform, null);
        } else {
            g2d.setColor(Color.BLUE);
            g2d.drawString("Unable to load image!", 25, 25);
        }
    }

    public static void main(String[] args) {
        Application myApp = new Application("Title");
        myApp.setVisible(true);

    }
}
