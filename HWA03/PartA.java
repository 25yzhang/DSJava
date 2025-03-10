import javax.sound.sampled.LineUnavailableException;

import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class PartA {
    public static void main(String[] args) {
        // create my tone generator
        ToneGenerator tg = new ToneGenerator();

        try {
            tg.init();
        } catch (LineUnavailableException e) {
            System.err.println("unable to initialize tone generator.");
        }

        // play jingle bells.
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 600);
        tg.play(Note.REST, 20);
        //
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 600);
        tg.play(Note.REST, 20);
        //
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.G4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.C4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.D4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 1200);
        tg.play(Note.REST, 20);
        //
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        //
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 150);
        tg.play(Note.REST, 20);
        tg.play(Note.E4, 150);
        tg.play(Note.REST, 20);
        //
        tg.play(Note.G4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.G4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.F4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.D4, 300);
        tg.play(Note.REST, 20);
        tg.play(Note.C4, 1200);
        tg.play(Note.REST, 20);
    }
}
