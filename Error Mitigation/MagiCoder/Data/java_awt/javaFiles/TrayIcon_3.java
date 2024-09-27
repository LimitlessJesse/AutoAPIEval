import java.awt.*;
import java.awt.TrayIcon;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class TrayIcon_3 {
    public static void main(String[] args) {
        // Create a BufferedImage
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, 100, 100);
        g2d.dispose();

        // Create a TrayIcon
        TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");

        // Set the image for the TrayIcon
        trayIcon.setImage(image);
    }
}
