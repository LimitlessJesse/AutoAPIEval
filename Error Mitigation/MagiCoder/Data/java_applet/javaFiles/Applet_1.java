import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String msg;

    public void init() {
        msg = "Initializing...";
        repaint();
    }

    public void start() {
        msg = "Starting...";
        repaint();
    }

    public void stop() {
        msg = "Stopping...";
        repaint();
    }

    public void destroy() {
        msg = "Destroying...";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 50);
    }
}
