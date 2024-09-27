import java.applet.Applet;
import java.awt.Graphics;

public class Applet_1 extends Applet {
    public void init() {
        // This method is called when the applet is first loaded into the browser.
        // It is used to initialize the applet.
        // For example, you can start a thread here, load resources, etc.
        System.out.println("Applet initialized");
    }

    public void start() {
        // This method is called when the applet is started.
        // You can start animations, etc. here.
        System.out.println("Applet started");
    }

    public void stop() {
        // This method is called when the applet is stopped.
        // You can stop animations, etc. here.
        System.out.println("Applet stopped");
    }

    public void destroy() {
        // This method is called when the applet is unloaded from the browser.
        // You can clean up resources, etc. here.
        System.out.println("Applet destroyed");
    }

    public void paint(Graphics g) {
        // This method is called when the applet needs to be repainted.
        // You can draw on the Graphics object here.
        g.drawString("Hello, World", 50, 25);
    }

    public static void main(String[] args) {
        // The main method is not used in applets.
        // It is used in standalone Java applications.
    }
}
