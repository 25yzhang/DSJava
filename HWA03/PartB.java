import java.awt.EventQueue;

import Animate.Application;
import sound.SoundClip;

public class PartB {
    public static void main(String[] args) {

        try {
            SoundClip sitar = new SoundClip("media/sitar.wav");
            sitar.open();

            EventQueue.invokeLater(() -> {
                Application myApp = new Application("Title");
                myApp.setVisible(true);
            });

            while (true) {
                sitar.play(true);
            }
        } catch (Exception e) {
            System.err.println("Cant open sitar");
        }

        /*
         * can use string path as well
         * String path = "media/boing.wav";
         * SoundClip boing = new SoundClip("media/boing.wav");
         * boing.open();
         * boing.play(true);
         * boing.close();
         */

    }
}
