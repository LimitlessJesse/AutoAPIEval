import java.awt.*;

public class SystemTray_3 {
    public static void main(String[] args) {
        // Check if system supports SystemTray
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }

        // Get the default system tray
        SystemTray tray = SystemTray.getSystemTray();

        // Create a TrayIcon
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");

        // Add the tray icon
        tray.add(trayIcon);

        // Remove the tray icon
        tray.remove(trayIcon);
    }
}
