import java.awt.*;

public class SystemTray_3 {
    public static void main(String[] args) {
        try {
            // Create a TrayIcon
            Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
            TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");

            // Add the TrayIcon to the SystemTray
            SystemTray systemTray = SystemTray.getSystemTray();
            systemTray.add(trayIcon);

            System.out.println("TrayIcon added successfully");
        } catch (AWTException e) {
            System.out.println("Desktop system tray is missing");
        }
    }
}
