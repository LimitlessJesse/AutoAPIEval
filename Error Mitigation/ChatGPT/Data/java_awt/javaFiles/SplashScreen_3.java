import java.awt.Graphics2D;
import java.awt.SplashScreen;

public class SplashScreen_3 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash != null) {
            Graphics2D graphics = splash.createGraphics();
            // Draw on the splash screen overlay image using the Graphics2D object
            graphics.drawString("Loading...", 10, 20);
            // Update the splash screen to display the changes immediately
            splash.update();
        } else {
            System.out.println("No splash screen is available");
        }
    }
}
