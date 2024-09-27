import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    public void start() {
        System.out.println("Applet started.");
    }

    public void stop() {
        System.out.println("Applet stopped.");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 25);
    }
}
