import java.applet.Applet;
import java.awt.Graphics;

public class Applet_2 extends Applet {
    public void start() {
        Graphics g = getGraphics();
        g.drawString("Hello, World!!!", 50, 25);
    }

    public static void main(String[] args) {
        // The start() method is called automatically when the applet is loaded
        Applet_2 applet = new Applet_2();
        applet.start();
    }
}
