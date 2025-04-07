import java.awt.EventQueue;
import Animate.Application;

public class PartB {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });
    }
}
