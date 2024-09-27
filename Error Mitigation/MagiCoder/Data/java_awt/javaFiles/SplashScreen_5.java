import java.awt.SplashScreen;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class SplashScreen_5 {
    public static void main(String[] args) {
        SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash!= null) {
            Graphics2D g2d = splash.createGraphics();
            if (g2d!= null) {
                // Draw something on the splash screen
                g2d.drawString("Hello, World!", 10, 10);
                // Update the splash screen
                splash.update();
                // Wait for a bit
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // Close the splash screen
                splash.close();
            }
        }
    }
}
