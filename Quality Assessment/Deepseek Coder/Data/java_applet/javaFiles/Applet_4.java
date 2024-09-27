import java.applet.Applet;
import java.awt.Graphics;

public class Applet_4 extends Applet {
    public void init() {
        System.out.println("Initializing Applet");
    }

    public void start() {
        System.out.println("Starting Applet");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, Applet", 50, 25);
    }

    public void stop() {
        System.out.println("Stopping Applet");
    }

    public void destroy() {
        System.out.println("Destroying Applet");
    }

    public static void main(String[] args) {
        // This is not a part of Applet, it's just to test the destroy method
        Applet_4 applet = new Applet_4();
        applet.init();
        applet.start();
        applet.destroy();
    }
}
